TRUNCATE plant;

INSERT INTO
plant(
    id,
    name,
    type,
    imageUrl,
       date,
       daystomaturity,
       description,
           notes,
    spacing
    )

VALUES
    (1,
    'Sun Gold Tomato',
    'vegetable',
    'https://www.johnnyseeds.com/on/demandware.static/-/Library-Sites-JSSSharedLibrary/default/dw7f36f17f/images/culture/143-tomatoes.jpg',  '04-01-2022',
    57,
    'high yielding plant with minimal pest issues.', 'Intense fruity flavor. Exceptionally sweet, bright tangerine-orange cherry tomatoes leave everyone begging for more. Vigorous plants start yielding early and bear right through the season. Tendency to split precludes shipping, making these an exclusively fresh-market treat. The taste can''t be beat. High resistance to fusarium wilt and tobacco mosaic virus. Indeterminate.', '36'),
    (2,
    'Glass Gem Corn',
    'vegetable',
    'https://urbangardenseed.com/wp-content/uploads/2021/07/00MAIN-3990-bjxx8a.jpg',
    '04-01-2022',
    120,
    'Should be planted in  be planted in clusters (not rows). Too few plants won''t pollinate themselves and you''ll get bare cobs.',
    'Glass Gem is something of a cross between true, modern popcorn and parching corn. Sturdy plants can reach 10 foot tall. Avg. ear size 6 to 8 inches. Requires a fairly long growing season for favorable yields. Bred by the late Carl Barnes, an Oklahoma Cherokee who dedicated his career to reclaiming and preserving seed of traditional Native American corns.',
    '8'),
    (3,
    'Everleaf Thai Towers',
    'herb',
    'https://www.johnnyseeds.com/dw/image/v2/BBBW_PRD/on/demandware.static/-/Sites-jss-master/default/dw8eb24b2f/images/products/herbs/04308_01_everleafthaitowers.jpg?sw=387&cx=302&cy=0&cw=1196&ch=1196',
    '04-07-2022',
    65,
    'great companion plant for tomatoes',
    'Very slow bolting, incredibly productive plant with vibrant Thai flavor. Compared to Sweet Thai, Everleaf Thai Towers has larger leaves at 2 to 3 inches, a taller, more productive plant habit, and is much later to flower. Plants are very upright with purple stems and densely packed, dark green leaves with a purple blush. Makes a beautiful, tidy, towering plant. Long, strong stems and profuse leaf production make it excellent for both bunching (from a field planting) and growing in pots.',
    '18'
    ),
    (4,
    'Garlic Chives',
    'herb',
    'https://www.johnnyseeds.com/dw/image/v2/BBBW_PRD/on/demandware.static/-/Sites-jss-master/default/dwbb3a27d9/images/products/herbs/03299_01_chinese_leeks.jpg?sw=387&cx=382&cy=10&cw=1044&ch=1044',
    '04-05-2022',
    90,
    'Individual leaves may be harvested once the plants are established. Harvest leaves before flowering begins.',
    'Thin, flat leaves with delicate garlic flavor.
    Attractive white flowers in midsummer, in the second year of growth. Flowers make a great addition to bouquets. The budded flower stalks are sold as ''gow choy'' in Chinese grocery stores.',
    '8'
    );
