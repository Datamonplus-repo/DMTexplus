package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp014 extends GXProcedure
{
   public pdyrp014( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp014.class ), "" );
   }

   public pdyrp014( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           int[] aP5 )
   {
      pdyrp014.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pdyrp014.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp014.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp014.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp014.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp014.this.AV8BarMaqCod = aP4[0];
      this.aP4 = aP4;
      pdyrp014.this.AV9BarVolMaq = aP5[0];
      this.aP5 = aP5;
      pdyrp014.this.AV10Barfacabs = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11Endutex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int2) ;
      pdyrp014.this.GXt_int1 = GXv_int2[0] ;
      AV11Endutex = GXt_int1 ;
      GXt_int1 = AV16Acabats2013 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      pdyrp014.this.GXt_int1 = GXv_int2[0] ;
      AV16Acabats2013 = GXt_int1 ;
      AV13UsurCod = " " ;
      GXt_char3 = AV14Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pdyrp014.this.GXt_char3 = GXv_char4[0] ;
      AV14Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV15EmprNom ;
      GXv_char6[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char4, GXv_char5, GXv_char6) ;
      pdyrp014.this.A396EmprCod = GXv_char4[0] ;
      pdyrp014.this.AV15EmprNom = GXv_char5[0] ;
      pdyrp014.this.AV13UsurCod = GXv_char6[0] ;
      n5057BarFacAbs = false ;
      /* Optimized UPDATE. */
      /* Using cursor P09942 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n5057BarFacAbs), AV10Barfacabs, Integer.valueOf(AV9BarVolMaq), AV8BarMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      if ( ( AV11Endutex == 1 ) || ( AV16Acabats2013 == 1 ) )
      {
         /* Using cursor P09943 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A150BarFacTin = P09943_A150BarFacTin[0] ;
            A153BarFasEst = P09943_A153BarFasEst[0] ;
            A603MaqCodBis = P09943_A603MaqCodBis[0] ;
            A194BarOrdLin = P09943_A194BarOrdLin[0] ;
            A758ProCod = P09943_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( A153BarFasEst == 0 )
               {
                  if ( ( ( GXutil.strcmp(A603MaqCodBis, AV8BarMaqCod) != 0 ) && ( AV16Acabats2013 == 0 ) ) || ( ( GXutil.strcmp(GXutil.substring( A603MaqCodBis, 1, 4), GXutil.substring( AV8BarMaqCod, 1, 4)) == 0 ) && ( GXutil.strcmp(A603MaqCodBis, AV8BarMaqCod) != 0 ) && ( AV16Acabats2013 == 1 ) ) )
                  {
                     A603MaqCodBis = AV8BarMaqCod ;
                  }
               }
               /* Using cursor P09944 */
               pr_default.execute(2, new Object[] {A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp014.this.A396EmprCod;
      this.aP1[0] = pdyrp014.this.A129BarCod;
      this.aP2[0] = pdyrp014.this.A132BarCodReo;
      this.aP3[0] = pdyrp014.this.A130BarCodPar;
      this.aP4[0] = pdyrp014.this.AV8BarMaqCod;
      this.aP5[0] = pdyrp014.this.AV9BarVolMaq;
      this.aP6[0] = pdyrp014.this.AV10Barfacabs;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp014");
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
      AV13UsurCod = "" ;
      AV14Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A180BarMaqCod = "" ;
      scmdbuf = "" ;
      P09943_A396EmprCod = new String[] {""} ;
      P09943_A129BarCod = new int[1] ;
      P09943_A132BarCodReo = new byte[1] ;
      P09943_A130BarCodPar = new String[] {""} ;
      P09943_A150BarFacTin = new String[] {""} ;
      P09943_A153BarFasEst = new byte[1] ;
      P09943_A603MaqCodBis = new String[] {""} ;
      P09943_A194BarOrdLin = new short[1] ;
      P09943_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp014__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P09943_A396EmprCod, P09943_A129BarCod, P09943_A132BarCodReo, P09943_A130BarCodPar, P09943_A150BarFacTin, P09943_A153BarFasEst, P09943_A603MaqCodBis, P09943_A194BarOrdLin, P09943_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11Endutex ;
   private byte AV16Acabats2013 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9BarVolMaq ;
   private int A236BarVolMaq ;
   private java.math.BigDecimal AV10Barfacabs ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8BarMaqCod ;
   private String AV13UsurCod ;
   private String AV14Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV15EmprNom ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String A180BarMaqCod ;
   private String scmdbuf ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private boolean n5057BarFacAbs ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09943_A396EmprCod ;
   private int[] P09943_A129BarCod ;
   private byte[] P09943_A132BarCodReo ;
   private String[] P09943_A130BarCodPar ;
   private String[] P09943_A150BarFacTin ;
   private byte[] P09943_A153BarFasEst ;
   private String[] P09943_A603MaqCodBis ;
   private short[] P09943_A194BarOrdLin ;
   private String[] P09943_A758ProCod ;
}

final  class pdyrp014__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09942", "UPDATE TXPBARCAD SET BarFacAbs=?, BarVolMaq=?, BarMaqCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P09943", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasEst, MaqCodBis, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09944", "UPDATE TXPBARFAS SET MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

