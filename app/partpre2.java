package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class partpre2 extends GXProcedure
{
   public partpre2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( partpre2.class ), "" );
   }

   public partpre2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      partpre2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      partpre2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      partpre2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      partpre2.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      partpre2.this.A7727ArtAdiCod = aP3[0];
      this.aP3 = aP3;
      partpre2.this.AV19Devolver = aP4[0];
      this.aP4 = aP4;
      partpre2.this.AV25Und = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV24PreAca ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRACAR", ""), GXv_int2) ;
      partpre2.this.GXt_int1 = GXv_int2[0] ;
      AV24PreAca = GXt_int1 ;
      GXt_int1 = AV23PreTin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRTIAR", ""), GXv_int2) ;
      partpre2.this.GXt_int1 = GXv_int2[0] ;
      AV23PreTin = GXt_int1 ;
      Gx_msg = httpContext.getMessage( "Precios", "") + GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
      /* Using cursor P04892 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Short.valueOf(A7727ArtAdiCod), A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk4892 = false ;
         A758ProCod = P04892_A758ProCod[0] ;
         A368DisFasLin = P04892_A368DisFasLin[0] ;
         A8506PFAPre = P04892_A8506PFAPre[0] ;
         n8506PFAPre = P04892_n8506PFAPre[0] ;
         A8507PFATip = P04892_A8507PFATip[0] ;
         n8507PFATip = P04892_n8507PFATip[0] ;
         A352DisArtTip = P04892_A352DisArtTip[0] ;
         A252CliCod = P04892_A252CliCod[0] ;
         A390DisTipCol = P04892_A390DisTipCol[0] ;
         n390DisTipCol = P04892_n390DisTipCol[0] ;
         A363DisColNum = P04892_A363DisColNum[0] ;
         n363DisColNum = P04892_n363DisColNum[0] ;
         A362DisColNom = P04892_A362DisColNom[0] ;
         n362DisColNom = P04892_n362DisColNom[0] ;
         A335DisArtCod = P04892_A335DisArtCod[0] ;
         A7740DisFasPre = P04892_A7740DisFasPre[0] ;
         n7740DisFasPre = P04892_n7740DisFasPre[0] ;
         A456FasActTin = P04892_A456FasActTin[0] ;
         n456FasActTin = P04892_n456FasActTin[0] ;
         A392DisUniMed = P04892_A392DisUniMed[0] ;
         A350DisArtRdt = P04892_A350DisArtRdt[0] ;
         A375DisNumUni = P04892_A375DisNumUni[0] ;
         A4343FasEstamp = P04892_A4343FasEstamp[0] ;
         n4343FasEstamp = P04892_n4343FasEstamp[0] ;
         A466FasPreKgm = P04892_A466FasPreKgm[0] ;
         n466FasPreKgm = P04892_n466FasPreKgm[0] ;
         A467FasPreMtr = P04892_A467FasPreMtr[0] ;
         n467FasPreMtr = P04892_n467FasPreMtr[0] ;
         A352DisArtTip = P04892_A352DisArtTip[0] ;
         A252CliCod = P04892_A252CliCod[0] ;
         A390DisTipCol = P04892_A390DisTipCol[0] ;
         n390DisTipCol = P04892_n390DisTipCol[0] ;
         A363DisColNum = P04892_A363DisColNum[0] ;
         n363DisColNum = P04892_n363DisColNum[0] ;
         A362DisColNom = P04892_A362DisColNom[0] ;
         n362DisColNom = P04892_n362DisColNom[0] ;
         A335DisArtCod = P04892_A335DisArtCod[0] ;
         A392DisUniMed = P04892_A392DisUniMed[0] ;
         A350DisArtRdt = P04892_A350DisArtRdt[0] ;
         A375DisNumUni = P04892_A375DisNumUni[0] ;
         A7740DisFasPre = P04892_A7740DisFasPre[0] ;
         n7740DisFasPre = P04892_n7740DisFasPre[0] ;
         A456FasActTin = P04892_A456FasActTin[0] ;
         n456FasActTin = P04892_n456FasActTin[0] ;
         A4343FasEstamp = P04892_A4343FasEstamp[0] ;
         n4343FasEstamp = P04892_n4343FasEstamp[0] ;
         A466FasPreKgm = P04892_A466FasPreKgm[0] ;
         n466FasPreKgm = P04892_n466FasPreKgm[0] ;
         A467FasPreMtr = P04892_A467FasPreMtr[0] ;
         n467FasPreMtr = P04892_n467FasPreMtr[0] ;
         A8506PFAPre = P04892_A8506PFAPre[0] ;
         n8506PFAPre = P04892_n8506PFAPre[0] ;
         A8507PFATip = P04892_A8507PFATip[0] ;
         n8507PFATip = P04892_n8507PFATip[0] ;
         AV26FasActTin = A456FasActTin ;
         if ( A7727ArtAdiCod == 0 )
         {
            if ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV23PreTin == 1 )
               {
                  /* Using cursor P04893 */
                  pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A335DisArtCod, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
                  while ( (pr_default.getStatus(1) != 101) )
                  {
                     A494ForSer = P04893_A494ForSer[0] ;
                     A482ForColNom = P04893_A482ForColNom[0] ;
                     A483ForColNum = P04893_A483ForColNum[0] ;
                     A831TipColCod = P04893_A831TipColCod[0] ;
                     A583IntCod = P04893_A583IntCod[0] ;
                     AV16IntCod = A583IntCod ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(1);
                  /* Using cursor P04894 */
                  pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A352DisArtTip), Byte.valueOf(AV16IntCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A8521PreTAICod = P04894_A8521PreTAICod[0] ;
                     A583IntCod = P04894_A583IntCod[0] ;
                     A8524PreTAIDto = P04894_A8524PreTAIDto[0] ;
                     n8524PreTAIDto = P04894_n8524PreTAIDto[0] ;
                     A8523PreTAIImp = P04894_A8523PreTAIImp[0] ;
                     n8523PreTAIImp = P04894_n8523PreTAIImp[0] ;
                     A8525PreTAITpo = P04894_A8525PreTAITpo[0] ;
                     n8525PreTAITpo = P04894_n8525PreTAITpo[0] ;
                     AV17Dto = A8524PreTAIDto ;
                     AV21Pre = A8523PreTAIImp ;
                     AV18Tipo = A8525PreTAITpo ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(2);
                  if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     AV22Ren = A350DisArtRdt ;
                     if ( AV22Ren.doubleValue() == 0 )
                     {
                        AV22Ren = DecimalUtil.doubleToDec(1) ;
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Articulo sin rendimiento!", ""));
                     }
                  }
                  else
                  {
                     AV22Ren = DecimalUtil.doubleToDec(1) ;
                  }
                  if ( DecimalUtil.compareTo(A375DisNumUni, DecimalUtil.doubleToDec(360).divide(AV22Ren, 18, java.math.RoundingMode.DOWN)) < 0 )
                  {
                     AV17Dto = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
            else if ( GXutil.strcmp(A4343FasEstamp, httpContext.getMessage( "S", "")) == 0 )
            {
            }
            else
            {
               if ( AV24PreAca == 1 )
               {
                  if ( A466FasPreKgm.doubleValue() > 0 )
                  {
                     AV21Pre = A466FasPreKgm ;
                     AV18Tipo = httpContext.getMessage( "K", "") ;
                  }
                  else
                  {
                     AV21Pre = A467FasPreMtr ;
                     AV18Tipo = httpContext.getMessage( "M", "") ;
                  }
               }
            }
         }
         else
         {
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P04892_A396EmprCod[0], A396EmprCod) == 0 ) && ( P04892_A361DisCod[0] == A361DisCod ) )
            {
               brk4892 = false ;
               A758ProCod = P04892_A758ProCod[0] ;
               A368DisFasLin = P04892_A368DisFasLin[0] ;
               A8506PFAPre = P04892_A8506PFAPre[0] ;
               n8506PFAPre = P04892_n8506PFAPre[0] ;
               A8507PFATip = P04892_A8507PFATip[0] ;
               n8507PFATip = P04892_n8507PFATip[0] ;
               A252CliCod = P04892_A252CliCod[0] ;
               A252CliCod = P04892_A252CliCod[0] ;
               A8506PFAPre = P04892_A8506PFAPre[0] ;
               n8506PFAPre = P04892_n8506PFAPre[0] ;
               A8507PFATip = P04892_A8507PFATip[0] ;
               n8507PFATip = P04892_n8507PFATip[0] ;
               if ( P04892_A7727ArtAdiCod[0] == A7727ArtAdiCod )
               {
                  if ( GXutil.strcmp(P04892_A457FasCod[0], A457FasCod) == 0 )
                  {
                     AV21Pre = A8506PFAPre ;
                     AV18Tipo = A8507PFATip ;
                  }
               }
               brk4892 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk4892 )
         {
            brk4892 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "P", "")) == 0 )
      {
         AV20Sal = (long)(DecimalUtil.decToDouble(AV21Pre)) ;
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + GXutil.trim( GXutil.str( AV20Sal, 10, 0)) ;
      }
      else if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "D", "")) == 0 )
      {
         AV20Sal = (long)(DecimalUtil.decToDouble(AV17Dto)) ;
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + GXutil.trim( GXutil.str( AV20Sal, 10, 0)) ;
      }
      else if ( GXutil.strcmp(AV19Devolver, httpContext.getMessage( "T", "")) == 0 )
      {
         if ( ( GXutil.strcmp(AV18Tipo, " ") == 0 ) && ( GXutil.strcmp(AV26FasActTin, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV25Und = httpContext.getMessage( "K", "") ;
         }
         else
         {
            AV25Und = AV18Tipo ;
         }
         Gx_msg += httpContext.getMessage( "Devolver : ", "") + AV19Devolver + httpContext.getMessage( ", Valor : ", "") + AV18Tipo ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = partpre2.this.A396EmprCod;
      this.aP1[0] = partpre2.this.A361DisCod;
      this.aP2[0] = partpre2.this.A457FasCod;
      this.aP3[0] = partpre2.this.A7727ArtAdiCod;
      this.aP4[0] = partpre2.this.AV19Devolver;
      this.aP5[0] = partpre2.this.AV25Und;
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
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04892_A758ProCod = new String[] {""} ;
      P04892_A368DisFasLin = new short[1] ;
      P04892_A396EmprCod = new String[] {""} ;
      P04892_A361DisCod = new int[1] ;
      P04892_A7727ArtAdiCod = new short[1] ;
      P04892_A457FasCod = new String[] {""} ;
      P04892_A8506PFAPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_n8506PFAPre = new boolean[] {false} ;
      P04892_A8507PFATip = new String[] {""} ;
      P04892_n8507PFATip = new boolean[] {false} ;
      P04892_A352DisArtTip = new short[1] ;
      P04892_A252CliCod = new int[1] ;
      P04892_A390DisTipCol = new byte[1] ;
      P04892_n390DisTipCol = new boolean[] {false} ;
      P04892_A363DisColNum = new int[1] ;
      P04892_n363DisColNum = new boolean[] {false} ;
      P04892_A362DisColNom = new String[] {""} ;
      P04892_n362DisColNom = new boolean[] {false} ;
      P04892_A335DisArtCod = new String[] {""} ;
      P04892_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_n7740DisFasPre = new boolean[] {false} ;
      P04892_A456FasActTin = new String[] {""} ;
      P04892_n456FasActTin = new boolean[] {false} ;
      P04892_A392DisUniMed = new String[] {""} ;
      P04892_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_A4343FasEstamp = new String[] {""} ;
      P04892_n4343FasEstamp = new boolean[] {false} ;
      P04892_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_n466FasPreKgm = new boolean[] {false} ;
      P04892_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04892_n467FasPreMtr = new boolean[] {false} ;
      A758ProCod = "" ;
      A8506PFAPre = DecimalUtil.ZERO ;
      A8507PFATip = "" ;
      A362DisColNom = "" ;
      A335DisArtCod = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A392DisUniMed = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A4343FasEstamp = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      AV26FasActTin = "" ;
      P04893_A396EmprCod = new String[] {""} ;
      P04893_A252CliCod = new int[1] ;
      P04893_A494ForSer = new String[] {""} ;
      P04893_A482ForColNom = new String[] {""} ;
      P04893_A483ForColNum = new int[1] ;
      P04893_A831TipColCod = new byte[1] ;
      P04893_A583IntCod = new byte[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P04894_A396EmprCod = new String[] {""} ;
      P04894_A252CliCod = new int[1] ;
      P04894_A8521PreTAICod = new short[1] ;
      P04894_A583IntCod = new byte[1] ;
      P04894_A8524PreTAIDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04894_n8524PreTAIDto = new boolean[] {false} ;
      P04894_A8523PreTAIImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04894_n8523PreTAIImp = new boolean[] {false} ;
      P04894_A8525PreTAITpo = new String[] {""} ;
      P04894_n8525PreTAITpo = new boolean[] {false} ;
      A8524PreTAIDto = DecimalUtil.ZERO ;
      A8523PreTAIImp = DecimalUtil.ZERO ;
      A8525PreTAITpo = "" ;
      AV17Dto = DecimalUtil.ZERO ;
      AV21Pre = DecimalUtil.ZERO ;
      AV18Tipo = "" ;
      AV22Ren = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.partpre2__default(),
         new Object[] {
             new Object[] {
            P04892_A758ProCod, P04892_A368DisFasLin, P04892_A396EmprCod, P04892_A361DisCod, P04892_A7727ArtAdiCod, P04892_A457FasCod, P04892_A8506PFAPre, P04892_n8506PFAPre, P04892_A8507PFATip, P04892_n8507PFATip,
            P04892_A352DisArtTip, P04892_A252CliCod, P04892_A390DisTipCol, P04892_n390DisTipCol, P04892_A363DisColNum, P04892_n363DisColNum, P04892_A362DisColNom, P04892_n362DisColNom, P04892_A335DisArtCod, P04892_A7740DisFasPre,
            P04892_n7740DisFasPre, P04892_A456FasActTin, P04892_n456FasActTin, P04892_A392DisUniMed, P04892_A350DisArtRdt, P04892_A375DisNumUni, P04892_A4343FasEstamp, P04892_n4343FasEstamp, P04892_A466FasPreKgm, P04892_n466FasPreKgm,
            P04892_A467FasPreMtr, P04892_n467FasPreMtr
            }
            , new Object[] {
            P04893_A396EmprCod, P04893_A252CliCod, P04893_A494ForSer, P04893_A482ForColNom, P04893_A483ForColNum, P04893_A831TipColCod, P04893_A583IntCod
            }
            , new Object[] {
            P04894_A396EmprCod, P04894_A252CliCod, P04894_A8521PreTAICod, P04894_A583IntCod, P04894_A8524PreTAIDto, P04894_n8524PreTAIDto, P04894_A8523PreTAIImp, P04894_n8523PreTAIImp, P04894_A8525PreTAITpo, P04894_n8525PreTAITpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24PreAca ;
   private byte AV23PreTin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A390DisTipCol ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV16IntCod ;
   private short A7727ArtAdiCod ;
   private short A368DisFasLin ;
   private short A352DisArtTip ;
   private short A8521PreTAICod ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A483ForColNum ;
   private long AV20Sal ;
   private java.math.BigDecimal A8506PFAPre ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A8524PreTAIDto ;
   private java.math.BigDecimal A8523PreTAIImp ;
   private java.math.BigDecimal AV17Dto ;
   private java.math.BigDecimal AV21Pre ;
   private java.math.BigDecimal AV22Ren ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV19Devolver ;
   private String AV25Und ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A8507PFATip ;
   private String A362DisColNom ;
   private String A335DisArtCod ;
   private String A456FasActTin ;
   private String A392DisUniMed ;
   private String A4343FasEstamp ;
   private String AV26FasActTin ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A8525PreTAITpo ;
   private String AV18Tipo ;
   private boolean brk4892 ;
   private boolean n8506PFAPre ;
   private boolean n8507PFATip ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean n7740DisFasPre ;
   private boolean n456FasActTin ;
   private boolean n4343FasEstamp ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n8524PreTAIDto ;
   private boolean n8523PreTAIImp ;
   private boolean n8525PreTAITpo ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04892_A758ProCod ;
   private short[] P04892_A368DisFasLin ;
   private String[] P04892_A396EmprCod ;
   private int[] P04892_A361DisCod ;
   private short[] P04892_A7727ArtAdiCod ;
   private String[] P04892_A457FasCod ;
   private java.math.BigDecimal[] P04892_A8506PFAPre ;
   private boolean[] P04892_n8506PFAPre ;
   private String[] P04892_A8507PFATip ;
   private boolean[] P04892_n8507PFATip ;
   private short[] P04892_A352DisArtTip ;
   private int[] P04892_A252CliCod ;
   private byte[] P04892_A390DisTipCol ;
   private boolean[] P04892_n390DisTipCol ;
   private int[] P04892_A363DisColNum ;
   private boolean[] P04892_n363DisColNum ;
   private String[] P04892_A362DisColNom ;
   private boolean[] P04892_n362DisColNom ;
   private String[] P04892_A335DisArtCod ;
   private java.math.BigDecimal[] P04892_A7740DisFasPre ;
   private boolean[] P04892_n7740DisFasPre ;
   private String[] P04892_A456FasActTin ;
   private boolean[] P04892_n456FasActTin ;
   private String[] P04892_A392DisUniMed ;
   private java.math.BigDecimal[] P04892_A350DisArtRdt ;
   private java.math.BigDecimal[] P04892_A375DisNumUni ;
   private String[] P04892_A4343FasEstamp ;
   private boolean[] P04892_n4343FasEstamp ;
   private java.math.BigDecimal[] P04892_A466FasPreKgm ;
   private boolean[] P04892_n466FasPreKgm ;
   private java.math.BigDecimal[] P04892_A467FasPreMtr ;
   private boolean[] P04892_n467FasPreMtr ;
   private String[] P04893_A396EmprCod ;
   private int[] P04893_A252CliCod ;
   private String[] P04893_A494ForSer ;
   private String[] P04893_A482ForColNom ;
   private int[] P04893_A483ForColNum ;
   private byte[] P04893_A831TipColCod ;
   private byte[] P04893_A583IntCod ;
   private String[] P04894_A396EmprCod ;
   private int[] P04894_A252CliCod ;
   private short[] P04894_A8521PreTAICod ;
   private byte[] P04894_A583IntCod ;
   private java.math.BigDecimal[] P04894_A8524PreTAIDto ;
   private boolean[] P04894_n8524PreTAIDto ;
   private java.math.BigDecimal[] P04894_A8523PreTAIImp ;
   private boolean[] P04894_n8523PreTAIImp ;
   private String[] P04894_A8525PreTAITpo ;
   private boolean[] P04894_n8525PreTAITpo ;
}

final  class partpre2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04892", "SELECT T1.ProCod, T1.DisFasLin, T1.EmprCod, T1.DisCod, T1.ArtAdiCod, T3.FasCod, T6.PFAPre, T6.PFATip, T2.DisArtTip, T2.CliCod, T2.DisTipCol, T2.DisColNum, T2.DisColNom, T2.DisArtCod, T3.DisFasPre, T4.FasActTin, T2.DisUniMed, T2.DisArtRdt, T2.DisNumUni, T4.FasEstamp, T5.FasPreKgm, T5.FasPreMtr FROM (((((TXPDisFPA T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) INNER JOIN TXPDISFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T1.DisCod AND T3.ProCod = T1.ProCod AND T3.DisFasLin = T1.DisFasLin) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T3.FasCod) LEFT JOIN TXPPREFAS T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T2.CliCod AND T5.FasCod = T3.FasCod) LEFT JOIN TXPARTPFA T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T2.CliCod AND T6.FasCod = T3.FasCod AND T6.ArtAdiCod = T1.ArtAdiCod) WHERE (T1.EmprCod = ? and T1.DisCod = ?) AND (T1.ArtAdiCod = ?) AND (T3.FasCod = ?) ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04893", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04894", "SELECT EmprCod, CliCod, PreTAICod, IntCod, PreTAIDto, PreTAIImp, PreTAITpo FROM TXPPRETA1 WHERE EmprCod = ? and CliCod = ? and PreTAICod = ? and IntCod = ? ORDER BY EmprCod, CliCod, PreTAICod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[26])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(21,5);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(22,5);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 13);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

