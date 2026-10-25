package com.rishi.electrohub.dtos;

import com.rishi.electrohub.utilities.ValidImage;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {

	private String id;
	@NotBlank(message = "Title for category is required")
	private String title;
	@ValidImage(message = "Not a valid image name")
	private String coverImageName;
}
