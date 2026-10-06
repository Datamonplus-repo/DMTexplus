package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preoper extends GXProcedure
{
   public preoper( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preoper.class ), "" );
   }

   public preoper( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      preoper.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      preoper.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      preoper.this.AV16BarOriCod = aP1[0];
      this.aP1 = aP1;
      preoper.this.AV17BarOriReo = aP2[0];
      this.aP2 = aP2;
      preoper.this.AV18BarOriPar = aP3[0];
      this.aP3 = aP3;
      preoper.this.AV19BarCod = aP4[0];
      this.aP4 = aP4;
      preoper.this.AV20BarCodReo = aP5[0];
      this.aP5 = aP5;
      preoper.this.AV21BarCodPar = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV24OK, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ok", ""));
         /* Using cursor P008Q2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarOriCod), Byte.valueOf(AV17BarOriReo), AV18BarOriPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P008Q2_A130BarCodPar[0] ;
            A132BarCodReo = P008Q2_A132BarCodReo[0] ;
            A129BarCod = P008Q2_A129BarCod[0] ;
            A396EmprCod = P008Q2_A396EmprCod[0] ;
            A200BarPieCod = P008Q2_A200BarPieCod[0] ;
            A44AlbRecCod = P008Q2_A44AlbRecCod[0] ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Entra", ""));
            AV25BarPieCod = A200BarPieCod ;
            AV26AlbRecCod = A44AlbRecCod ;
            /* Execute user subroutine: 'NUEPIE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         GXv_char1[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarOriCod ;
         GXv_int3[0] = AV17BarOriReo ;
         GXv_char4[0] = AV18BarOriPar ;
         GXv_int5[0] = AV19BarCod ;
         GXv_int6[0] = AV20BarCodReo ;
         GXv_char7[0] = AV21BarCodPar ;
         GXv_int8[0] = AV22Conos ;
         GXv_decimal9[0] = AV23Kilos ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         new app.preopeh(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_int8, GXv_decimal9, GXv_decimal10) ;
         preoper.this.AV15EmprCod = GXv_char1[0] ;
         preoper.this.AV16BarOriCod = GXv_int2[0] ;
         preoper.this.AV17BarOriReo = GXv_int3[0] ;
         preoper.this.AV18BarOriPar = GXv_char4[0] ;
         preoper.this.AV19BarCod = GXv_int5[0] ;
         preoper.this.AV20BarCodReo = GXv_int6[0] ;
         preoper.this.AV21BarCodPar = GXv_char7[0] ;
         preoper.this.AV22Conos = GXv_int8[0] ;
         preoper.this.AV23Kilos = GXv_decimal9[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NUEPIE' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPBARPIE

      */
      A396EmprCod = AV15EmprCod ;
      A129BarCod = AV19BarCod ;
      A132BarCodReo = AV20BarCodReo ;
      A130BarCodPar = AV21BarCodPar ;
      A200BarPieCod = AV25BarPieCod ;
      A44AlbRecCod = AV26AlbRecCod ;
      /* Using cursor P008Q3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   protected void cleanup( )
   {
      this.aP0[0] = preoper.this.AV15EmprCod;
      this.aP1[0] = preoper.this.AV16BarOriCod;
      this.aP2[0] = preoper.this.AV17BarOriReo;
      this.aP3[0] = preoper.this.AV18BarOriPar;
      this.aP4[0] = preoper.this.AV19BarCod;
      this.aP5[0] = preoper.this.AV20BarCodReo;
      this.aP6[0] = preoper.this.AV21BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "preoper");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OK = "" ;
      scmdbuf = "" ;
      P008Q2_A130BarCodPar = new String[] {""} ;
      P008Q2_A132BarCodReo = new byte[1] ;
      P008Q2_A129BarCod = new int[1] ;
      P008Q2_A396EmprCod = new String[] {""} ;
      P008Q2_A200BarPieCod = new String[] {""} ;
      P008Q2_A44AlbRecCod = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A200BarPieCod = "" ;
      AV25BarPieCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      AV23Kilos = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preoper__default(),
         new Object[] {
             new Object[] {
            P008Q2_A130BarCodPar, P008Q2_A132BarCodReo, P008Q2_A129BarCod, P008Q2_A396EmprCod, P008Q2_A200BarPieCod, P008Q2_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarOriReo ;
   private byte AV20BarCodReo ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV16BarOriCod ;
   private int AV19BarCod ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int AV26AlbRecCod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private int AV22Conos ;
   private int GXv_int8[] ;
   private int GX_INS18 ;
   private java.math.BigDecimal AV23Kilos ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String AV15EmprCod ;
   private String AV18BarOriPar ;
   private String AV21BarCodPar ;
   private String AV24OK ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private String AV25BarPieCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P008Q2_A130BarCodPar ;
   private byte[] P008Q2_A132BarCodReo ;
   private int[] P008Q2_A129BarCod ;
   private String[] P008Q2_A396EmprCod ;
   private String[] P008Q2_A200BarPieCod ;
   private int[] P008Q2_A44AlbRecCod ;
}

final  class preoper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008Q2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarPieCod, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008Q3", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

