
package com.rishi.electrohub.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements UserDetails {

	private static final boolean bool = true;

	@Id
	@Column(name = "user_id")
	private String id;

	@Column(name = "user_name")
	private String name;

	@Column(name = "sex")
	private String sex;

	@Column(name = "about", length = 500)
	private String about;

	@Column(name = "user_email", unique = bool)
	private String email;

	@Column(name = "user_password")
	private String password;

	@Column(name = "user_img")
	private String imageName;

	@OneToOne(mappedBy = "user",
			cascade = CascadeType.REMOVE,
			fetch = FetchType.LAZY)
	private Cart cart;

	@ManyToMany(fetch = FetchType.EAGER,
			cascade = CascadeType.ALL)
	@JoinTable(
			name = "user_role_association",
			joinColumns = {
					@JoinColumn(referencedColumnName = "user_id")
			},
			inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "role_id")
			}
	)
	private Set<Role> roles = new HashSet<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<SimpleGrantedAuthority> authorities =
				this.roles.stream()
						.map(role -> new SimpleGrantedAuthority(role.getRoleName()))
						.collect(Collectors.toSet());

		return authorities;
	}

	@Override
	public String getUsername() {
		return email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
