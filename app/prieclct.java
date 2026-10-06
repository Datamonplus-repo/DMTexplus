package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prieclct extends GXProcedure
{
   public prieclct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prieclct.class ), "" );
   }

   public prieclct( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      prieclct.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      prieclct.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prieclct.this.AV8DisCod = aP1[0];
      this.aP1 = aP1;
      prieclct.this.AV9Opcion = aP2[0];
      this.aP2 = aP2;
      prieclct.this.AV25Tipo = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Control Riesgo Clientes", "") );
      if ( GXutil.strcmp(AV9Opcion, httpContext.getMessage( "D", "")) == 0 )
      {
         /* Using cursor P01JG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P01JG2_A361DisCod[0] ;
            A252CliCod = P01JG2_A252CliCod[0] ;
            A375DisNumUni = P01JG2_A375DisNumUni[0] ;
            AV10CliCod = A252CliCod ;
            AV11Disnumuni = A375DisNumUni ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      /* Using cursor P01JG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P01JG3_A252CliCod[0] ;
         A301CliRieCon = P01JG3_A301CliRieCon[0] ;
         A302CliRieMh = P01JG3_A302CliRieMh[0] ;
         AV15CliRieCon = A301CliRieCon ;
         AV21CliRieMh = A302CliRieMh ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV10CliCod ;
      GXv_decimal3[0] = AV16Riesgo ;
      GXv_decimal4[0] = AV12Kgsalb ;
      GXv_decimal5[0] = AV13KgsDisp ;
      GXv_decimal6[0] = AV14KgsHDR ;
      new app.prieclca(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_decimal3, GXv_decimal4, GXv_decimal5, GXv_decimal6) ;
      prieclct.this.A396EmprCod = GXv_char1[0] ;
      prieclct.this.AV10CliCod = GXv_int2[0] ;
      prieclct.this.AV16Riesgo = GXv_decimal3[0] ;
      prieclct.this.AV12Kgsalb = GXv_decimal4[0] ;
      prieclct.this.AV13KgsDisp = GXv_decimal5[0] ;
      prieclct.this.AV14KgsHDR = GXv_decimal6[0] ;
      if ( DecimalUtil.compareTo(AV16Riesgo, AV15CliRieCon) > 0 )
      {
         AV18Continuar = " " ;
         while ( ( GXutil.strcmp(AV18Continuar, httpContext.getMessage( "S", "")) != 0 ) && ( GXutil.strcmp(AV18Continuar, httpContext.getMessage( "N", "")) != 0 ) )
         {
         }
         if ( GXutil.strcmp(AV18Continuar, httpContext.getMessage( "N", "")) == 0 )
         {
            System.out.println( httpContext.getMessage( "Eliminando disposición", "") );
            /* Execute user subroutine: 'BORRA' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            System.out.println( "" );
         }
         else
         {
            /* Execute user subroutine: 'CTL_RIESGO_MAYOR' */
            S121 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      else
      {
         /* Execute user subroutine: 'CTL_RIESGO_MAYOR' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BORRA' Routine */
      returnInSub = false ;
      GXv_int7[0] = AV19FlagNoHdr ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOHDR ", ""), GXv_int7) ;
      prieclct.this.AV19FlagNoHdr = GXv_int7[0] ;
      if ( AV19FlagNoHdr == 0 )
      {
         /* Using cursor P01JG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A361DisCod = P01JG4_A361DisCod[0] ;
            A367DisEst = P01JG4_A367DisEst[0] ;
            AV20DisEst = A367DisEst ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV20DisEst == 1 )
         {
            if ( GXutil.strcmp(AV25Tipo, httpContext.getMessage( "H", "")) == 0 )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = AV8DisCod ;
               new app.pelidih(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
               prieclct.this.A396EmprCod = GXv_char1[0] ;
               prieclct.this.AV8DisCod = GXv_int2[0] ;
            }
            else
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = AV8DisCod ;
               new app.pelidis(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
               prieclct.this.A396EmprCod = GXv_char1[0] ;
               prieclct.this.AV8DisCod = GXv_int2[0] ;
            }
         }
         else
         {
            /* Using cursor P01JG5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8DisCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A361DisCod = P01JG5_A361DisCod[0] ;
               A213BarSit = P01JG5_A213BarSit[0] ;
               A129BarCod = P01JG5_A129BarCod[0] ;
               A132BarCodReo = P01JG5_A132BarCodReo[0] ;
               A130BarCodPar = P01JG5_A130BarCodPar[0] ;
               AV24Texto_i = httpContext.getMessage( "Eliminacion HDR", "") ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmname, AV22Usurcod, AV23Station, AV24Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
               if ( GXutil.strcmp(AV25Tipo, httpContext.getMessage( "H", "")) == 0 )
               {
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int2[0] = A129BarCod ;
                  GXv_int7[0] = A132BarCodReo ;
                  GXv_char8[0] = A130BarCodPar ;
                  new app.pbordih(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int7, GXv_char8) ;
                  prieclct.this.A396EmprCod = GXv_char1[0] ;
                  prieclct.this.A129BarCod = GXv_int2[0] ;
                  prieclct.this.A132BarCodReo = GXv_int7[0] ;
                  prieclct.this.A130BarCodPar = GXv_char8[0] ;
               }
               else
               {
                  GXv_char8[0] = A396EmprCod ;
                  GXv_int2[0] = A129BarCod ;
                  GXv_int7[0] = A132BarCodReo ;
                  GXv_char1[0] = A130BarCodPar ;
                  GXv_int9[0] = AV8DisCod ;
                  new app.pbordis(remoteHandle, context).execute( GXv_char8, GXv_int2, GXv_int7, GXv_char1, GXv_int9) ;
                  prieclct.this.A396EmprCod = GXv_char8[0] ;
                  prieclct.this.A129BarCod = GXv_int2[0] ;
                  prieclct.this.A132BarCodReo = GXv_int7[0] ;
                  prieclct.this.A130BarCodPar = GXv_char1[0] ;
                  prieclct.this.AV8DisCod = GXv_int9[0] ;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
      }
      else
      {
         if ( GXutil.strcmp(AV25Tipo, httpContext.getMessage( "H", "")) == 0 )
         {
            GXv_char8[0] = A396EmprCod ;
            GXv_int9[0] = AV8DisCod ;
            new app.pelidih(remoteHandle, context).execute( GXv_char8, GXv_int9) ;
            prieclct.this.A396EmprCod = GXv_char8[0] ;
            prieclct.this.AV8DisCod = GXv_int9[0] ;
         }
         else
         {
            GXv_char8[0] = A396EmprCod ;
            GXv_int9[0] = AV8DisCod ;
            new app.pelidis(remoteHandle, context).execute( GXv_char8, GXv_int9) ;
            prieclct.this.A396EmprCod = GXv_char8[0] ;
            prieclct.this.AV8DisCod = GXv_int9[0] ;
         }
      }
   }

   public void S121( )
   {
      /* 'CTL_RIESGO_MAYOR' Routine */
      returnInSub = false ;
      if ( DecimalUtil.compareTo(AV16Riesgo, AV21CliRieMh) > 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P01JG6 */
         pr_default.execute(4, new Object[] {Gx_date, AV16Riesgo, A396EmprCod, Integer.valueOf(AV10CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* End optimized UPDATE. */
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = prieclct.this.A396EmprCod;
      this.aP1[0] = prieclct.this.AV8DisCod;
      this.aP2[0] = prieclct.this.AV9Opcion;
      this.aP3[0] = prieclct.this.AV25Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "prieclct");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01JG2_A396EmprCod = new String[] {""} ;
      P01JG2_A361DisCod = new int[1] ;
      P01JG2_A252CliCod = new int[1] ;
      P01JG2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      AV11Disnumuni = DecimalUtil.ZERO ;
      P01JG3_A396EmprCod = new String[] {""} ;
      P01JG3_A252CliCod = new int[1] ;
      P01JG3_A301CliRieCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01JG3_A302CliRieMh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A301CliRieCon = DecimalUtil.ZERO ;
      A302CliRieMh = DecimalUtil.ZERO ;
      AV15CliRieCon = DecimalUtil.ZERO ;
      AV21CliRieMh = DecimalUtil.ZERO ;
      AV16Riesgo = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV12Kgsalb = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV13KgsDisp = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV14KgsHDR = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV18Continuar = "" ;
      P01JG4_A396EmprCod = new String[] {""} ;
      P01JG4_A361DisCod = new int[1] ;
      P01JG4_A367DisEst = new byte[1] ;
      P01JG5_A396EmprCod = new String[] {""} ;
      P01JG5_A361DisCod = new int[1] ;
      P01JG5_A213BarSit = new byte[1] ;
      P01JG5_A129BarCod = new int[1] ;
      P01JG5_A132BarCodReo = new byte[1] ;
      P01JG5_A130BarCodPar = new String[] {""} ;
      A130BarCodPar = "" ;
      AV24Texto_i = "" ;
      AV32Pgmname = "" ;
      AV22Usurcod = "" ;
      AV23Station = "" ;
      GXv_int2 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      Gx_date = GXutil.nullDate() ;
      A275CliFecMh = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prieclct__default(),
         new Object[] {
             new Object[] {
            P01JG2_A396EmprCod, P01JG2_A361DisCod, P01JG2_A252CliCod, P01JG2_A375DisNumUni
            }
            , new Object[] {
            P01JG3_A396EmprCod, P01JG3_A252CliCod, P01JG3_A301CliRieCon, P01JG3_A302CliRieMh
            }
            , new Object[] {
            P01JG4_A396EmprCod, P01JG4_A361DisCod, P01JG4_A367DisEst
            }
            , new Object[] {
            P01JG5_A396EmprCod, P01JG5_A361DisCod, P01JG5_A213BarSit, P01JG5_A129BarCod, P01JG5_A132BarCodReo, P01JG5_A130BarCodPar
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV32Pgmname = "PRieClCt" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV32Pgmname = "PRieClCt" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19FlagNoHdr ;
   private byte A367DisEst ;
   private byte AV20DisEst ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte GXv_int7[] ;
   private short Gx_err ;
   private int AV8DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV10CliCod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV11Disnumuni ;
   private java.math.BigDecimal A301CliRieCon ;
   private java.math.BigDecimal A302CliRieMh ;
   private java.math.BigDecimal AV15CliRieCon ;
   private java.math.BigDecimal AV21CliRieMh ;
   private java.math.BigDecimal AV16Riesgo ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV12Kgsalb ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV13KgsDisp ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV14KgsHDR ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV9Opcion ;
   private String AV25Tipo ;
   private String scmdbuf ;
   private String AV18Continuar ;
   private String A130BarCodPar ;
   private String AV32Pgmname ;
   private String AV22Usurcod ;
   private String AV23Station ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private java.util.Date Gx_date ;
   private java.util.Date A275CliFecMh ;
   private boolean returnInSub ;
   private String AV24Texto_i ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01JG2_A396EmprCod ;
   private int[] P01JG2_A361DisCod ;
   private int[] P01JG2_A252CliCod ;
   private java.math.BigDecimal[] P01JG2_A375DisNumUni ;
   private String[] P01JG3_A396EmprCod ;
   private int[] P01JG3_A252CliCod ;
   private java.math.BigDecimal[] P01JG3_A301CliRieCon ;
   private java.math.BigDecimal[] P01JG3_A302CliRieMh ;
   private String[] P01JG4_A396EmprCod ;
   private int[] P01JG4_A361DisCod ;
   private byte[] P01JG4_A367DisEst ;
   private String[] P01JG5_A396EmprCod ;
   private int[] P01JG5_A361DisCod ;
   private byte[] P01JG5_A213BarSit ;
   private int[] P01JG5_A129BarCod ;
   private byte[] P01JG5_A132BarCodReo ;
   private String[] P01JG5_A130BarCodPar ;
}

final  class prieclct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01JG2", "SELECT EmprCod, DisCod, CliCod, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01JG3", "SELECT EmprCod, CliCod, CliRieCon, CliRieMh FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01JG4", "SELECT EmprCod, DisCod, DisEst FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01JG5", "SELECT EmprCod, DisCod, BarSit, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01JG6", "UPDATE TXPCLIENT SET CliFecMh=?, CliRieMh=?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

