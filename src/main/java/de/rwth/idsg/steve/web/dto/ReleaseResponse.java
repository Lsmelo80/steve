/*
 * SteVe - SteckdosenVerwaltung - https://github.com/steve-community/steve
 * Copyright (C) 2013-2022 SteVe Community Team
 * All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package de.rwth.idsg.steve.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Does not contain all the fields in the actual response, but only the ones that we are interested in.
 *
 * API doc: https://developer.github.com/v3/repos/releases/#get-the-latest-release
 *
 * @author Sevket Goekay <sevketgokay@gmail.com>
 * @since 04.10.2016
 */
@Getter
@Setter
@ToString
public class ReleaseResponse {
    private String tagName;
    private String name;

    private String htmlUrl;
    private String tarballUrl;
    private String zipballUrl;
}
