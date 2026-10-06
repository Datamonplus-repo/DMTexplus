package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamm extends GXProcedure
{
   public pclamm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamm.class ), "" );
   }

   public pclamm( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclamm.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pclamm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamm.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclamm.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclamm.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamm.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclamm.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamm.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamm.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclamm.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclamm.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclamm.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclamm.this.AV112Opi = aP11[0];
      this.aP11 = aP11;
      pclamm.this.AV113Barfactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111F_Reccol = (byte)(0) ;
      GXv_int1[0] = AV111F_Reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclamm.this.AV111F_Reccol = GXv_int1[0] ;
      AV114Fase_nt = (byte)(0) ;
      /* Using cursor P01Q92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01Q92_A2804RecLinMaq[0] ;
         A130BarCodPar = P01Q92_A130BarCodPar[0] ;
         A132BarCodReo = P01Q92_A132BarCodReo[0] ;
         A129BarCod = P01Q92_A129BarCod[0] ;
         A5408RecLinCol = P01Q92_A5408RecLinCol[0] ;
         AV114Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
      AV91Family = GXutil.substring( AV16Clave, 8, 2) ;
      AV97BarAcc = GXutil.space( (short)(1)) ;
      if ( ( ( AV111F_Reccol == 1 ) && ( AV112Opi == 0 ) ) || ( ( AV111F_Reccol == 1 ) && ( AV114Fase_nt == 1 ) ) )
      {
         /* Using cursor P01Q93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2804RecLinMaq = P01Q93_A2804RecLinMaq[0] ;
            A130BarCodPar = P01Q93_A130BarCodPar[0] ;
            A132BarCodReo = P01Q93_A132BarCodReo[0] ;
            A129BarCod = P01Q93_A129BarCod[0] ;
            A5253BarAcc = P01Q93_A5253BarAcc[0] ;
            A5413RecMatCol = P01Q93_A5413RecMatCol[0] ;
            n5413RecMatCol = P01Q93_n5413RecMatCol[0] ;
            A5253BarAcc = P01Q93_A5253BarAcc[0] ;
            AV97BarAcc = A5253BarAcc ;
            if ( AV31Matiz == A5413RecMatCol )
            {
               AV98Ok_matiz = (byte)(1) ;
            }
            AV94Ok_family = (byte)(0) ;
            /* Using cursor P01Q94 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A5409RecPrdCol = P01Q94_A5409RecPrdCol[0] ;
               n5409RecPrdCol = P01Q94_n5409RecPrdCol[0] ;
               A5408RecLinCol = P01Q94_A5408RecLinCol[0] ;
               AV93Length = (byte)(GXutil.len( A5409RecPrdCol)) ;
               if ( AV93Length > 5 )
               {
                  if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A5409RecPrdCol, 1, 2), "."), CommonUtil.decimalVal( AV91Family, ".")) == 0 )
                  {
                     AV94Ok_family = (byte)(1) ;
                  }
               }
               else
               {
                  AV96FamiliaA = GXutil.substring( AV91Family, 1, 1) ;
                  if ( GXutil.strcmp(GXutil.substring( A5409RecPrdCol, 1, 1), AV96FamiliaA) == 0 )
                  {
                     AV94Ok_family = (byte)(1) ;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01Q95 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A130BarCodPar = P01Q95_A130BarCodPar[0] ;
            A132BarCodReo = P01Q95_A132BarCodReo[0] ;
            A129BarCod = P01Q95_A129BarCod[0] ;
            A5253BarAcc = P01Q95_A5253BarAcc[0] ;
            A252CliCod = P01Q95_A252CliCod[0] ;
            n252CliCod = P01Q95_n252CliCod[0] ;
            A212BarSer = P01Q95_A212BarSer[0] ;
            A135BarColNom = P01Q95_A135BarColNom[0] ;
            A136BarColNum = P01Q95_A136BarColNum[0] ;
            A218BarTipCol = P01Q95_A218BarTipCol[0] ;
            AV97BarAcc = A5253BarAcc ;
            AV41BarCliCod = A252CliCod ;
            AV46ForSer = A212BarSer ;
            AV47ForColNom = A135BarColNom ;
            AV48ForColNum = A136BarColNum ;
            AV49TipColCod = A218BarTipCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'COLORANTES' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'MATIZ' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( ( GXutil.strcmp(AV97BarAcc, httpContext.getMessage( "S", "")) == 0 ) && ( AV94Ok_family == 1 ) && ( AV98Ok_matiz == 1 ) )
      {
         AV17PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV92ForNumCol = 0 ;
      /* Using cursor P01Q96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P01Q96_A831TipColCod[0] ;
         A483ForColNum = P01Q96_A483ForColNum[0] ;
         A482ForColNom = P01Q96_A482ForColNom[0] ;
         A494ForSer = P01Q96_A494ForSer[0] ;
         A252CliCod = P01Q96_A252CliCod[0] ;
         n252CliCod = P01Q96_n252CliCod[0] ;
         A486ForNumCol = P01Q96_A486ForNumCol[0] ;
         AV92ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S121( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV98Ok_matiz = (byte)(0) ;
      /* Using cursor P01Q97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV41BarCliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A626MatCod = P01Q97_A626MatCod[0] ;
         A831TipColCod = P01Q97_A831TipColCod[0] ;
         A483ForColNum = P01Q97_A483ForColNum[0] ;
         A482ForColNom = P01Q97_A482ForColNom[0] ;
         A494ForSer = P01Q97_A494ForSer[0] ;
         A252CliCod = P01Q97_A252CliCod[0] ;
         n252CliCod = P01Q97_n252CliCod[0] ;
         AV98Ok_matiz = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S131( )
   {
      /* 'COLORANTES' Routine */
      returnInSub = false ;
      AV94Ok_family = (byte)(0) ;
      /* Using cursor P01Q98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV92ForNumCol)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A486ForNumCol = P01Q98_A486ForNumCol[0] ;
         A719PrdNum = P01Q98_A719PrdNum[0] ;
         A309ColLin = P01Q98_A309ColLin[0] ;
         AV93Length = (byte)(GXutil.len( A719PrdNum)) ;
         if ( AV93Length > 5 )
         {
            if ( DecimalUtil.compareTo(CommonUtil.decimalVal( GXutil.substring( A719PrdNum, 1, 2), "."), CommonUtil.decimalVal( AV91Family, ".")) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         else
         {
            AV96FamiliaA = GXutil.substring( AV91Family, 1, 1) ;
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), AV96FamiliaA) == 0 )
            {
               AV94Ok_family = (byte)(1) ;
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamm.this.A396EmprCod;
      this.aP1[0] = pclamm.this.AV15Descrip;
      this.aP2[0] = pclamm.this.AV16Clave;
      this.aP3[0] = pclamm.this.AV17PrdVal;
      this.aP4[0] = pclamm.this.AV18BarCod;
      this.aP5[0] = pclamm.this.AV19BarCodReo;
      this.aP6[0] = pclamm.this.AV20BarCodPar;
      this.aP7[0] = pclamm.this.AV21TotKil;
      this.aP8[0] = pclamm.this.AV22PrdDesc;
      this.aP9[0] = pclamm.this.AV23Accion;
      this.aP10[0] = pclamm.this.AV67BarLinMaq;
      this.aP11[0] = pclamm.this.AV112Opi;
      this.aP12[0] = pclamm.this.AV113Barfactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01Q92_A396EmprCod = new String[] {""} ;
      P01Q92_A2804RecLinMaq = new short[1] ;
      P01Q92_A130BarCodPar = new String[] {""} ;
      P01Q92_A132BarCodReo = new byte[1] ;
      P01Q92_A129BarCod = new int[1] ;
      P01Q92_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      AV91Family = "" ;
      AV97BarAcc = "" ;
      P01Q93_A396EmprCod = new String[] {""} ;
      P01Q93_A2804RecLinMaq = new short[1] ;
      P01Q93_A130BarCodPar = new String[] {""} ;
      P01Q93_A132BarCodReo = new byte[1] ;
      P01Q93_A129BarCod = new int[1] ;
      P01Q93_A5253BarAcc = new String[] {""} ;
      P01Q93_A5413RecMatCol = new short[1] ;
      P01Q93_n5413RecMatCol = new boolean[] {false} ;
      A5253BarAcc = "" ;
      P01Q94_A396EmprCod = new String[] {""} ;
      P01Q94_A129BarCod = new int[1] ;
      P01Q94_A132BarCodReo = new byte[1] ;
      P01Q94_A130BarCodPar = new String[] {""} ;
      P01Q94_A2804RecLinMaq = new short[1] ;
      P01Q94_A5409RecPrdCol = new String[] {""} ;
      P01Q94_n5409RecPrdCol = new boolean[] {false} ;
      P01Q94_A5408RecLinCol = new short[1] ;
      A5409RecPrdCol = "" ;
      AV96FamiliaA = "" ;
      P01Q95_A396EmprCod = new String[] {""} ;
      P01Q95_A130BarCodPar = new String[] {""} ;
      P01Q95_A132BarCodReo = new byte[1] ;
      P01Q95_A129BarCod = new int[1] ;
      P01Q95_A5253BarAcc = new String[] {""} ;
      P01Q95_A252CliCod = new int[1] ;
      P01Q95_n252CliCod = new boolean[] {false} ;
      P01Q95_A212BarSer = new String[] {""} ;
      P01Q95_A135BarColNom = new String[] {""} ;
      P01Q95_A136BarColNum = new int[1] ;
      P01Q95_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      P01Q96_A396EmprCod = new String[] {""} ;
      P01Q96_A831TipColCod = new byte[1] ;
      P01Q96_A483ForColNum = new int[1] ;
      P01Q96_A482ForColNom = new String[] {""} ;
      P01Q96_A494ForSer = new String[] {""} ;
      P01Q96_A252CliCod = new int[1] ;
      P01Q96_n252CliCod = new boolean[] {false} ;
      P01Q96_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P01Q97_A396EmprCod = new String[] {""} ;
      P01Q97_A626MatCod = new short[1] ;
      P01Q97_A831TipColCod = new byte[1] ;
      P01Q97_A483ForColNum = new int[1] ;
      P01Q97_A482ForColNom = new String[] {""} ;
      P01Q97_A494ForSer = new String[] {""} ;
      P01Q97_A252CliCod = new int[1] ;
      P01Q97_n252CliCod = new boolean[] {false} ;
      P01Q98_A396EmprCod = new String[] {""} ;
      P01Q98_A486ForNumCol = new int[1] ;
      P01Q98_A719PrdNum = new String[] {""} ;
      P01Q98_A309ColLin = new short[1] ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamm__default(),
         new Object[] {
             new Object[] {
            P01Q92_A396EmprCod, P01Q92_A2804RecLinMaq, P01Q92_A130BarCodPar, P01Q92_A132BarCodReo, P01Q92_A129BarCod, P01Q92_A5408RecLinCol
            }
            , new Object[] {
            P01Q93_A396EmprCod, P01Q93_A2804RecLinMaq, P01Q93_A130BarCodPar, P01Q93_A132BarCodReo, P01Q93_A129BarCod, P01Q93_A5253BarAcc, P01Q93_A5413RecMatCol, P01Q93_n5413RecMatCol
            }
            , new Object[] {
            P01Q94_A396EmprCod, P01Q94_A129BarCod, P01Q94_A132BarCodReo, P01Q94_A130BarCodPar, P01Q94_A2804RecLinMaq, P01Q94_A5409RecPrdCol, P01Q94_n5409RecPrdCol, P01Q94_A5408RecLinCol
            }
            , new Object[] {
            P01Q95_A396EmprCod, P01Q95_A130BarCodPar, P01Q95_A132BarCodReo, P01Q95_A129BarCod, P01Q95_A5253BarAcc, P01Q95_A252CliCod, P01Q95_n252CliCod, P01Q95_A212BarSer, P01Q95_A135BarColNom, P01Q95_A136BarColNum,
            P01Q95_A218BarTipCol
            }
            , new Object[] {
            P01Q96_A396EmprCod, P01Q96_A831TipColCod, P01Q96_A483ForColNum, P01Q96_A482ForColNom, P01Q96_A494ForSer, P01Q96_A252CliCod, P01Q96_A486ForNumCol
            }
            , new Object[] {
            P01Q97_A396EmprCod, P01Q97_A626MatCod, P01Q97_A831TipColCod, P01Q97_A483ForColNum, P01Q97_A482ForColNom, P01Q97_A494ForSer, P01Q97_A252CliCod
            }
            , new Object[] {
            P01Q98_A396EmprCod, P01Q98_A486ForNumCol, P01Q98_A719PrdNum, P01Q98_A309ColLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV112Opi ;
   private byte AV111F_Reccol ;
   private byte GXv_int1[] ;
   private byte AV114Fase_nt ;
   private byte A132BarCodReo ;
   private byte AV98Ok_matiz ;
   private byte AV94Ok_family ;
   private byte AV93Length ;
   private byte A218BarTipCol ;
   private byte AV49TipColCod ;
   private byte A831TipColCod ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short AV31Matiz ;
   private short A5413RecMatCol ;
   private short A626MatCod ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int AV92ForNumCol ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113Barfactin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV91Family ;
   private String AV97BarAcc ;
   private String A5253BarAcc ;
   private String A5409RecPrdCol ;
   private String AV96FamiliaA ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A719PrdNum ;
   private boolean n5413RecMatCol ;
   private boolean n5409RecPrdCol ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private String[] aP12 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Q92_A396EmprCod ;
   private short[] P01Q92_A2804RecLinMaq ;
   private String[] P01Q92_A130BarCodPar ;
   private byte[] P01Q92_A132BarCodReo ;
   private int[] P01Q92_A129BarCod ;
   private short[] P01Q92_A5408RecLinCol ;
   private String[] P01Q93_A396EmprCod ;
   private short[] P01Q93_A2804RecLinMaq ;
   private String[] P01Q93_A130BarCodPar ;
   private byte[] P01Q93_A132BarCodReo ;
   private int[] P01Q93_A129BarCod ;
   private String[] P01Q93_A5253BarAcc ;
   private short[] P01Q93_A5413RecMatCol ;
   private boolean[] P01Q93_n5413RecMatCol ;
   private String[] P01Q94_A396EmprCod ;
   private int[] P01Q94_A129BarCod ;
   private byte[] P01Q94_A132BarCodReo ;
   private String[] P01Q94_A130BarCodPar ;
   private short[] P01Q94_A2804RecLinMaq ;
   private String[] P01Q94_A5409RecPrdCol ;
   private boolean[] P01Q94_n5409RecPrdCol ;
   private short[] P01Q94_A5408RecLinCol ;
   private String[] P01Q95_A396EmprCod ;
   private String[] P01Q95_A130BarCodPar ;
   private byte[] P01Q95_A132BarCodReo ;
   private int[] P01Q95_A129BarCod ;
   private String[] P01Q95_A5253BarAcc ;
   private int[] P01Q95_A252CliCod ;
   private boolean[] P01Q95_n252CliCod ;
   private String[] P01Q95_A212BarSer ;
   private String[] P01Q95_A135BarColNom ;
   private int[] P01Q95_A136BarColNum ;
   private byte[] P01Q95_A218BarTipCol ;
   private String[] P01Q96_A396EmprCod ;
   private byte[] P01Q96_A831TipColCod ;
   private int[] P01Q96_A483ForColNum ;
   private String[] P01Q96_A482ForColNom ;
   private String[] P01Q96_A494ForSer ;
   private int[] P01Q96_A252CliCod ;
   private boolean[] P01Q96_n252CliCod ;
   private int[] P01Q96_A486ForNumCol ;
   private String[] P01Q97_A396EmprCod ;
   private short[] P01Q97_A626MatCod ;
   private byte[] P01Q97_A831TipColCod ;
   private int[] P01Q97_A483ForColNum ;
   private String[] P01Q97_A482ForColNom ;
   private String[] P01Q97_A494ForSer ;
   private int[] P01Q97_A252CliCod ;
   private boolean[] P01Q97_n252CliCod ;
   private String[] P01Q98_A396EmprCod ;
   private int[] P01Q98_A486ForNumCol ;
   private String[] P01Q98_A719PrdNum ;
   private short[] P01Q98_A309ColLin ;
}

final  class pclamm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Q92", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q93", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarAcc, T1.RecMatCol FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q94", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdCol, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q95", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAcc, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q96", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q97", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q98", "SELECT EmprCod, ForNumCol, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

