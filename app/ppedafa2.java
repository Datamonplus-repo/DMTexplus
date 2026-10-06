package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedafa2 extends GXProcedure
{
   public ppedafa2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedafa2.class ), "" );
   }

   public ppedafa2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            int[] aP6 )
   {
      ppedafa2.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 )
   {
      ppedafa2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedafa2.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      ppedafa2.this.AV14CliCod = aP2[0];
      this.aP2 = aP2;
      ppedafa2.this.AV29Artcod = aP3[0];
      this.aP3 = aP3;
      ppedafa2.this.AV30TipArtCod = aP4[0];
      this.aP4 = aP4;
      ppedafa2.this.AV26PArtColNom = aP5[0];
      this.aP5 = aP5;
      ppedafa2.this.AV27PArtColNum = aP6[0];
      this.aP6 = aP6;
      ppedafa2.this.AV28PArtTC = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV21PreAca ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRACAR", ""), GXv_int2) ;
      ppedafa2.this.GXt_int1 = GXv_int2[0] ;
      AV21PreAca = GXt_int1 ;
      GXt_int1 = AV22PreTin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRTIAR", ""), GXv_int2) ;
      ppedafa2.this.GXt_int1 = GXv_int2[0] ;
      AV22PreTin = GXt_int1 ;
      /* Using cursor P053W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P053W2_A252CliCod[0] ;
         n252CliCod = P053W2_n252CliCod[0] ;
         A456FasActTin = P053W2_A456FasActTin[0] ;
         n456FasActTin = P053W2_n456FasActTin[0] ;
         A11568PArtUnd = P053W2_A11568PArtUnd[0] ;
         n11568PArtUnd = P053W2_n11568PArtUnd[0] ;
         A11549PArtRen = P053W2_A11549PArtRen[0] ;
         n11549PArtRen = P053W2_n11549PArtRen[0] ;
         A11567PArtKgm = P053W2_A11567PArtKgm[0] ;
         n11567PArtKgm = P053W2_n11567PArtKgm[0] ;
         A11566PArtMtr = P053W2_A11566PArtMtr[0] ;
         n11566PArtMtr = P053W2_n11566PArtMtr[0] ;
         A4343FasEstamp = P053W2_A4343FasEstamp[0] ;
         n4343FasEstamp = P053W2_n4343FasEstamp[0] ;
         A466FasPreKgm = P053W2_A466FasPreKgm[0] ;
         n466FasPreKgm = P053W2_n466FasPreKgm[0] ;
         A467FasPreMtr = P053W2_A467FasPreMtr[0] ;
         n467FasPreMtr = P053W2_n467FasPreMtr[0] ;
         A457FasCod = P053W2_A457FasCod[0] ;
         A11592PAFPre = P053W2_A11592PAFPre[0] ;
         n11592PAFPre = P053W2_n11592PAFPre[0] ;
         A11593PAFDto = P053W2_A11593PAFDto[0] ;
         n11593PAFDto = P053W2_n11593PAFDto[0] ;
         A11611PAFOrd = P053W2_A11611PAFOrd[0] ;
         A456FasActTin = P053W2_A456FasActTin[0] ;
         n456FasActTin = P053W2_n456FasActTin[0] ;
         A4343FasEstamp = P053W2_A4343FasEstamp[0] ;
         n4343FasEstamp = P053W2_n4343FasEstamp[0] ;
         A252CliCod = P053W2_A252CliCod[0] ;
         n252CliCod = P053W2_n252CliCod[0] ;
         A11568PArtUnd = P053W2_A11568PArtUnd[0] ;
         n11568PArtUnd = P053W2_n11568PArtUnd[0] ;
         A11549PArtRen = P053W2_A11549PArtRen[0] ;
         n11549PArtRen = P053W2_n11549PArtRen[0] ;
         A11567PArtKgm = P053W2_A11567PArtKgm[0] ;
         n11567PArtKgm = P053W2_n11567PArtKgm[0] ;
         A11566PArtMtr = P053W2_A11566PArtMtr[0] ;
         n11566PArtMtr = P053W2_n11566PArtMtr[0] ;
         A466FasPreKgm = P053W2_A466FasPreKgm[0] ;
         n466FasPreKgm = P053W2_n466FasPreKgm[0] ;
         A467FasPreMtr = P053W2_A467FasPreMtr[0] ;
         n467FasPreMtr = P053W2_n467FasPreMtr[0] ;
         if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( AV22PreTin == 1 )
            {
               /* Using cursor P053W3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV14CliCod), AV29Artcod, AV26PArtColNom, Integer.valueOf(AV27PArtColNum), Short.valueOf(AV28PArtTC)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A831TipColCod = P053W3_A831TipColCod[0] ;
                  A483ForColNum = P053W3_A483ForColNum[0] ;
                  A482ForColNom = P053W3_A482ForColNom[0] ;
                  A494ForSer = P053W3_A494ForSer[0] ;
                  A252CliCod = P053W3_A252CliCod[0] ;
                  n252CliCod = P053W3_n252CliCod[0] ;
                  A583IntCod = P053W3_A583IntCod[0] ;
                  AV19IntCod = A583IntCod ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               AV20Pre = DecimalUtil.doubleToDec(0) ;
               AV18Dto = DecimalUtil.doubleToDec(0) ;
               /* Using cursor P053W4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(AV30TipArtCod), Byte.valueOf(AV19IntCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A8521PreTAICod = P053W4_A8521PreTAICod[0] ;
                  A583IntCod = P053W4_A583IntCod[0] ;
                  A8524PreTAIDto = P053W4_A8524PreTAIDto[0] ;
                  n8524PreTAIDto = P053W4_n8524PreTAIDto[0] ;
                  A8523PreTAIImp = P053W4_A8523PreTAIImp[0] ;
                  n8523PreTAIImp = P053W4_n8523PreTAIImp[0] ;
                  A8525PreTAITpo = P053W4_A8525PreTAITpo[0] ;
                  n8525PreTAITpo = P053W4_n8525PreTAITpo[0] ;
                  AV18Dto = A8524PreTAIDto ;
                  AV20Pre = A8523PreTAIImp ;
                  AV25Tipo = A8525PreTAITpo ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
               if ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "M", "")) == 0 )
               {
                  AV23Ren = A11549PArtRen ;
                  if ( AV23Ren.doubleValue() == 0 )
                  {
                     AV23Ren = DecimalUtil.doubleToDec(1) ;
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo sin rendimiento!", ""));
                  }
               }
               else
               {
                  AV23Ren = DecimalUtil.doubleToDec(1) ;
               }
               if ( ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "K", "")) == 0 ) && ( DecimalUtil.compareTo(A11567PArtKgm, DecimalUtil.doubleToDec(360).divide(AV23Ren, 18, java.math.RoundingMode.DOWN)) < 0 ) )
               {
                  AV18Dto = DecimalUtil.doubleToDec(0) ;
               }
               if ( ( GXutil.strcmp(A11568PArtUnd, httpContext.getMessage( "M", "")) == 0 ) && ( DecimalUtil.compareTo(A11566PArtMtr, DecimalUtil.doubleToDec(360).divide(AV23Ren, 18, java.math.RoundingMode.DOWN)) < 0 ) )
               {
                  AV18Dto = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
         else if ( GXutil.strcmp(A4343FasEstamp, httpContext.getMessage( "S", "")) == 0 )
         {
         }
         else
         {
            if ( AV21PreAca == 1 )
            {
               if ( A466FasPreKgm.doubleValue() > 0 )
               {
                  AV20Pre = A466FasPreKgm ;
                  AV25Tipo = httpContext.getMessage( "K", "") ;
               }
               else
               {
                  AV20Pre = A467FasPreMtr ;
                  AV25Tipo = httpContext.getMessage( "M", "") ;
               }
            }
         }
         Gx_msg = httpContext.getMessage( "Fascod   =", "") + A457FasCod + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "FasActTin=", "") + A456FasActTin + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "PAFOrd   =", "") + GXutil.str( A11611PAFOrd, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Clicod   =", "") + GXutil.str( AV14CliCod, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Articulo =", "") + AV29Artcod + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Color    =", "") + AV26PArtColNom + " " + GXutil.str( AV27PArtColNum, 6, 0) + " " + GXutil.str( AV28PArtTC, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Intensid =", "") + GXutil.str( AV19IntCod, 2, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "TArticulo=", "") + GXutil.str( AV30TipArtCod, 4, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&PreTin  =", "") + GXutil.str( AV22PreTin, 1, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&PreAca  =", "") + GXutil.str( AV21PreAca, 1, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "&Pre     =", "") + GXutil.str( AV20Pre, 10, 2) + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
         A11592PAFPre = AV20Pre ;
         n11592PAFPre = false ;
         A11593PAFDto = AV18Dto ;
         n11593PAFDto = false ;
         /* Using cursor P053W5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n11592PAFPre), A11592PAFPre, Boolean.valueOf(n11593PAFDto), A11593PAFDto, A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Aplicacion de Precios...", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedafa2.this.A396EmprCod;
      this.aP1[0] = ppedafa2.this.A11604PArtId;
      this.aP2[0] = ppedafa2.this.AV14CliCod;
      this.aP3[0] = ppedafa2.this.AV29Artcod;
      this.aP4[0] = ppedafa2.this.AV30TipArtCod;
      this.aP5[0] = ppedafa2.this.AV26PArtColNom;
      this.aP6[0] = ppedafa2.this.AV27PArtColNum;
      this.aP7[0] = ppedafa2.this.AV28PArtTC;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P053W2_A252CliCod = new int[1] ;
      P053W2_n252CliCod = new boolean[] {false} ;
      P053W2_A396EmprCod = new String[] {""} ;
      P053W2_A11604PArtId = new int[1] ;
      P053W2_A456FasActTin = new String[] {""} ;
      P053W2_n456FasActTin = new boolean[] {false} ;
      P053W2_A11568PArtUnd = new String[] {""} ;
      P053W2_n11568PArtUnd = new boolean[] {false} ;
      P053W2_A11549PArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n11549PArtRen = new boolean[] {false} ;
      P053W2_A11567PArtKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n11567PArtKgm = new boolean[] {false} ;
      P053W2_A11566PArtMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n11566PArtMtr = new boolean[] {false} ;
      P053W2_A4343FasEstamp = new String[] {""} ;
      P053W2_n4343FasEstamp = new boolean[] {false} ;
      P053W2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n466FasPreKgm = new boolean[] {false} ;
      P053W2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n467FasPreMtr = new boolean[] {false} ;
      P053W2_A457FasCod = new String[] {""} ;
      P053W2_A11592PAFPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n11592PAFPre = new boolean[] {false} ;
      P053W2_A11593PAFDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W2_n11593PAFDto = new boolean[] {false} ;
      P053W2_A11611PAFOrd = new short[1] ;
      A456FasActTin = "" ;
      A11568PArtUnd = "" ;
      A11549PArtRen = DecimalUtil.ZERO ;
      A11567PArtKgm = DecimalUtil.ZERO ;
      A11566PArtMtr = DecimalUtil.ZERO ;
      A4343FasEstamp = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A11592PAFPre = DecimalUtil.ZERO ;
      A11593PAFDto = DecimalUtil.ZERO ;
      P053W3_A396EmprCod = new String[] {""} ;
      P053W3_A831TipColCod = new byte[1] ;
      P053W3_A483ForColNum = new int[1] ;
      P053W3_A482ForColNom = new String[] {""} ;
      P053W3_A494ForSer = new String[] {""} ;
      P053W3_A252CliCod = new int[1] ;
      P053W3_n252CliCod = new boolean[] {false} ;
      P053W3_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV20Pre = DecimalUtil.ZERO ;
      AV18Dto = DecimalUtil.ZERO ;
      P053W4_A396EmprCod = new String[] {""} ;
      P053W4_A252CliCod = new int[1] ;
      P053W4_n252CliCod = new boolean[] {false} ;
      P053W4_A8521PreTAICod = new short[1] ;
      P053W4_A583IntCod = new byte[1] ;
      P053W4_A8524PreTAIDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W4_n8524PreTAIDto = new boolean[] {false} ;
      P053W4_A8523PreTAIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P053W4_n8523PreTAIImp = new boolean[] {false} ;
      P053W4_A8525PreTAITpo = new String[] {""} ;
      P053W4_n8525PreTAITpo = new boolean[] {false} ;
      A8524PreTAIDto = DecimalUtil.ZERO ;
      A8523PreTAIImp = DecimalUtil.ZERO ;
      A8525PreTAITpo = "" ;
      AV25Tipo = "" ;
      AV23Ren = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedafa2__default(),
         new Object[] {
             new Object[] {
            P053W2_A252CliCod, P053W2_n252CliCod, P053W2_A396EmprCod, P053W2_A11604PArtId, P053W2_A456FasActTin, P053W2_n456FasActTin, P053W2_A11568PArtUnd, P053W2_n11568PArtUnd, P053W2_A11549PArtRen, P053W2_n11549PArtRen,
            P053W2_A11567PArtKgm, P053W2_n11567PArtKgm, P053W2_A11566PArtMtr, P053W2_n11566PArtMtr, P053W2_A4343FasEstamp, P053W2_n4343FasEstamp, P053W2_A466FasPreKgm, P053W2_n466FasPreKgm, P053W2_A467FasPreMtr, P053W2_n467FasPreMtr,
            P053W2_A457FasCod, P053W2_A11592PAFPre, P053W2_n11592PAFPre, P053W2_A11593PAFDto, P053W2_n11593PAFDto, P053W2_A11611PAFOrd
            }
            , new Object[] {
            P053W3_A396EmprCod, P053W3_A831TipColCod, P053W3_A483ForColNum, P053W3_A482ForColNom, P053W3_A494ForSer, P053W3_A252CliCod, P053W3_A583IntCod
            }
            , new Object[] {
            P053W4_A396EmprCod, P053W4_A252CliCod, P053W4_A8521PreTAICod, P053W4_A583IntCod, P053W4_A8524PreTAIDto, P053W4_n8524PreTAIDto, P053W4_A8523PreTAIImp, P053W4_n8523PreTAIImp, P053W4_A8525PreTAITpo, P053W4_n8525PreTAITpo
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21PreAca ;
   private byte AV22PreTin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV19IntCod ;
   private short AV30TipArtCod ;
   private short AV28PArtTC ;
   private short A11611PAFOrd ;
   private short A8521PreTAICod ;
   private short Gx_err ;
   private int A11604PArtId ;
   private int AV14CliCod ;
   private int AV27PArtColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private java.math.BigDecimal A11549PArtRen ;
   private java.math.BigDecimal A11567PArtKgm ;
   private java.math.BigDecimal A11566PArtMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A11592PAFPre ;
   private java.math.BigDecimal A11593PAFDto ;
   private java.math.BigDecimal AV20Pre ;
   private java.math.BigDecimal AV18Dto ;
   private java.math.BigDecimal A8524PreTAIDto ;
   private java.math.BigDecimal A8523PreTAIImp ;
   private java.math.BigDecimal AV23Ren ;
   private String A396EmprCod ;
   private String AV29Artcod ;
   private String AV26PArtColNom ;
   private String scmdbuf ;
   private String A456FasActTin ;
   private String A11568PArtUnd ;
   private String A4343FasEstamp ;
   private String A457FasCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A8525PreTAITpo ;
   private String AV25Tipo ;
   private String Gx_msg ;
   private boolean n252CliCod ;
   private boolean n456FasActTin ;
   private boolean n11568PArtUnd ;
   private boolean n11549PArtRen ;
   private boolean n11567PArtKgm ;
   private boolean n11566PArtMtr ;
   private boolean n4343FasEstamp ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n11592PAFPre ;
   private boolean n11593PAFDto ;
   private boolean n8524PreTAIDto ;
   private boolean n8523PreTAIImp ;
   private boolean n8525PreTAITpo ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P053W2_A252CliCod ;
   private boolean[] P053W2_n252CliCod ;
   private String[] P053W2_A396EmprCod ;
   private int[] P053W2_A11604PArtId ;
   private String[] P053W2_A456FasActTin ;
   private boolean[] P053W2_n456FasActTin ;
   private String[] P053W2_A11568PArtUnd ;
   private boolean[] P053W2_n11568PArtUnd ;
   private java.math.BigDecimal[] P053W2_A11549PArtRen ;
   private boolean[] P053W2_n11549PArtRen ;
   private java.math.BigDecimal[] P053W2_A11567PArtKgm ;
   private boolean[] P053W2_n11567PArtKgm ;
   private java.math.BigDecimal[] P053W2_A11566PArtMtr ;
   private boolean[] P053W2_n11566PArtMtr ;
   private String[] P053W2_A4343FasEstamp ;
   private boolean[] P053W2_n4343FasEstamp ;
   private java.math.BigDecimal[] P053W2_A466FasPreKgm ;
   private boolean[] P053W2_n466FasPreKgm ;
   private java.math.BigDecimal[] P053W2_A467FasPreMtr ;
   private boolean[] P053W2_n467FasPreMtr ;
   private String[] P053W2_A457FasCod ;
   private java.math.BigDecimal[] P053W2_A11592PAFPre ;
   private boolean[] P053W2_n11592PAFPre ;
   private java.math.BigDecimal[] P053W2_A11593PAFDto ;
   private boolean[] P053W2_n11593PAFDto ;
   private short[] P053W2_A11611PAFOrd ;
   private String[] P053W3_A396EmprCod ;
   private byte[] P053W3_A831TipColCod ;
   private int[] P053W3_A483ForColNum ;
   private String[] P053W3_A482ForColNom ;
   private String[] P053W3_A494ForSer ;
   private int[] P053W3_A252CliCod ;
   private boolean[] P053W3_n252CliCod ;
   private byte[] P053W3_A583IntCod ;
   private String[] P053W4_A396EmprCod ;
   private int[] P053W4_A252CliCod ;
   private boolean[] P053W4_n252CliCod ;
   private short[] P053W4_A8521PreTAICod ;
   private byte[] P053W4_A583IntCod ;
   private java.math.BigDecimal[] P053W4_A8524PreTAIDto ;
   private boolean[] P053W4_n8524PreTAIDto ;
   private java.math.BigDecimal[] P053W4_A8523PreTAIImp ;
   private boolean[] P053W4_n8523PreTAIImp ;
   private String[] P053W4_A8525PreTAITpo ;
   private boolean[] P053W4_n8525PreTAITpo ;
}

final  class ppedafa2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P053W2", "SELECT T3.CliCod, T1.EmprCod, T1.PArtId, T2.FasActTin, T3.PArtUnd, T3.PArtRen, T3.PArtKgm, T3.PArtMtr, T2.FasEstamp, T4.FasPreKgm, T4.FasPreMtr, T1.FasCod, T1.PAFPre, T1.PAFDto, T1.PAFOrd FROM (((TXPPedAFa T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPedAEs T3 ON T3.EmprCod = T1.EmprCod AND T3.PArtId = T1.PArtId) LEFT JOIN TXPPREFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod AND T4.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.PArtId = ? ORDER BY T1.EmprCod, T1.PArtId, T1.PAFOrd ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P053W3", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P053W4", "SELECT EmprCod, CliCod, PreTAICod, IntCod, PreTAIDto, PreTAIImp, PreTAITpo FROM TXPPRETA1 WHERE EmprCod = ? and CliCod = ? and PreTAICod = ? and IntCod = ? ORDER BY EmprCod, CliCod, PreTAICod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P053W5", "UPDATE TXPPedAFa SET PAFPre=?, PAFDto=?  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAFa")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 8);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

