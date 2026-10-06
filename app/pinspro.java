package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinspro extends GXProcedure
{
   public pinspro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinspro.class ), "" );
   }

   public pinspro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            String[] aP5 ,
                            short[] aP6 ,
                            short[] aP7 ,
                            String[] aP8 )
   {
      pinspro.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 )
   {
      pinspro.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pinspro.this.AV16TermiCod = aP1[0];
      this.aP1 = aP1;
      pinspro.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pinspro.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pinspro.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pinspro.this.AV20BarMaqPrf = aP5[0];
      this.aP5 = aP5;
      pinspro.this.AV21BarLinMaq = aP6[0];
      this.aP6 = aP6;
      pinspro.this.AV22BarPrfLin = aP7[0];
      this.aP7 = aP7;
      pinspro.this.AV23BarPrfCod = aP8[0];
      this.aP8 = aP8;
      pinspro.this.AV24BarPrfULi2 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27UsurCod = " " ;
      AV28Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV15EmprCod ;
      GXv_char2[0] = AV29EmprNom ;
      GXv_char3[0] = AV27UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV28Station, GXv_char1, GXv_char2, GXv_char3) ;
      pinspro.this.AV15EmprCod = GXv_char1[0] ;
      pinspro.this.AV29EmprNom = GXv_char2[0] ;
      pinspro.this.AV27UsurCod = GXv_char3[0] ;
      /* Using cursor P00GH2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16TermiCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, Short.valueOf(AV21BarLinMaq), AV20BarMaqPrf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2794BarLinMaq = P00GH2_A2794BarLinMaq[0] ;
         A2795BarMaqPrf = P00GH2_A2795BarMaqPrf[0] ;
         n2795BarMaqPrf = P00GH2_n2795BarMaqPrf[0] ;
         A130BarCodPar = P00GH2_A130BarCodPar[0] ;
         A132BarCodReo = P00GH2_A132BarCodReo[0] ;
         A129BarCod = P00GH2_A129BarCod[0] ;
         A2792TermiCod = P00GH2_A2792TermiCod[0] ;
         A396EmprCod = P00GH2_A396EmprCod[0] ;
         A2800BarPrfULi2 = P00GH2_A2800BarPrfULi2[0] ;
         n2800BarPrfULi2 = P00GH2_n2800BarPrfULi2[0] ;
         W396EmprCod = A396EmprCod ;
         W2792TermiCod = A2792TermiCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV25BarLinMaq2 = A2794BarLinMaq ;
         A2800BarPrfULi2 = AV24BarPrfULi2 ;
         n2800BarPrfULi2 = false ;
         /*
            INSERT RECORD ON TABLE TXPBARPR2

         */
         W396EmprCod = A396EmprCod ;
         W2792TermiCod = A2792TermiCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W2794BarLinMaq = A2794BarLinMaq ;
         A396EmprCod = AV15EmprCod ;
         A2792TermiCod = AV16TermiCod ;
         A129BarCod = AV17BarCod ;
         A132BarCodReo = AV18BarCodReo ;
         A130BarCodPar = AV19BarCodPar ;
         A2794BarLinMaq = AV25BarLinMaq2 ;
         A1255BarPrfLin = AV22BarPrfLin ;
         A207BarPrfCod = AV23BarPrfCod ;
         n207BarPrfCod = false ;
         /* Using cursor P00GH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n207BarPrfCod = false ;
            /* Optimized UPDATE. */
            /* Using cursor P00GH4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n207BarPrfCod), AV23BarPrfCod, AV15EmprCod, AV16TermiCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, Short.valueOf(AV25BarLinMaq2), Short.valueOf(AV22BarPrfLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A2792TermiCod = W2792TermiCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A2794BarLinMaq = W2794BarLinMaq ;
         /* End Insert */
         AV26Inc_obs = httpContext.getMessage( "Creacion Receta", "") + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "HDR ", "") + GXutil.str( AV17BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " # " + GXutil.str( A2794BarLinMaq, 4, 0) + GXutil.newLine( ) ;
         AV26Inc_obs += httpContext.getMessage( "INSERT Proceso QUimico ", "") + AV23BarPrfCod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV34Pgmname, AV27UsurCod, AV28Station, AV26Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P00GH5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2800BarPrfULi2), Short.valueOf(A2800BarPrfULi2), A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARMAQ");
         A396EmprCod = W396EmprCod ;
         A2792TermiCod = W2792TermiCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinspro.this.AV15EmprCod;
      this.aP1[0] = pinspro.this.AV16TermiCod;
      this.aP2[0] = pinspro.this.AV17BarCod;
      this.aP3[0] = pinspro.this.AV18BarCodReo;
      this.aP4[0] = pinspro.this.AV19BarCodPar;
      this.aP5[0] = pinspro.this.AV20BarMaqPrf;
      this.aP6[0] = pinspro.this.AV21BarLinMaq;
      this.aP7[0] = pinspro.this.AV22BarPrfLin;
      this.aP8[0] = pinspro.this.AV23BarPrfCod;
      this.aP9[0] = pinspro.this.AV24BarPrfULi2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinspro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27UsurCod = "" ;
      AV28Station = "" ;
      GXv_char1 = new String[1] ;
      AV29EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P00GH2_A2794BarLinMaq = new short[1] ;
      P00GH2_A2795BarMaqPrf = new String[] {""} ;
      P00GH2_n2795BarMaqPrf = new boolean[] {false} ;
      P00GH2_A130BarCodPar = new String[] {""} ;
      P00GH2_A132BarCodReo = new byte[1] ;
      P00GH2_A129BarCod = new int[1] ;
      P00GH2_A2792TermiCod = new String[] {""} ;
      P00GH2_A396EmprCod = new String[] {""} ;
      P00GH2_A2800BarPrfULi2 = new short[1] ;
      P00GH2_n2800BarPrfULi2 = new boolean[] {false} ;
      A2795BarMaqPrf = "" ;
      A130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      W2792TermiCod = "" ;
      W130BarCodPar = "" ;
      A207BarPrfCod = "" ;
      Gx_emsg = "" ;
      AV26Inc_obs = "" ;
      AV34Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinspro__default(),
         new Object[] {
             new Object[] {
            P00GH2_A2794BarLinMaq, P00GH2_A2795BarMaqPrf, P00GH2_n2795BarMaqPrf, P00GH2_A130BarCodPar, P00GH2_A132BarCodReo, P00GH2_A129BarCod, P00GH2_A2792TermiCod, P00GH2_A396EmprCod, P00GH2_A2800BarPrfULi2, P00GH2_n2800BarPrfULi2
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV34Pgmname = "PINSPRO" ;
      /* GeneXus formulas. */
      AV34Pgmname = "PINSPRO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private short AV21BarLinMaq ;
   private short AV22BarPrfLin ;
   private short AV24BarPrfULi2 ;
   private short A2794BarLinMaq ;
   private short A2800BarPrfULi2 ;
   private short AV25BarLinMaq2 ;
   private short W2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS407 ;
   private String AV15EmprCod ;
   private String AV16TermiCod ;
   private String AV19BarCodPar ;
   private String AV20BarMaqPrf ;
   private String AV23BarPrfCod ;
   private String AV27UsurCod ;
   private String AV28Station ;
   private String GXv_char1[] ;
   private String AV29EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A2795BarMaqPrf ;
   private String A130BarCodPar ;
   private String A2792TermiCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W2792TermiCod ;
   private String W130BarCodPar ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private String AV34Pgmname ;
   private boolean n2795BarMaqPrf ;
   private boolean n2800BarPrfULi2 ;
   private boolean n207BarPrfCod ;
   private String AV26Inc_obs ;
   private short[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P00GH2_A2794BarLinMaq ;
   private String[] P00GH2_A2795BarMaqPrf ;
   private boolean[] P00GH2_n2795BarMaqPrf ;
   private String[] P00GH2_A130BarCodPar ;
   private byte[] P00GH2_A132BarCodReo ;
   private int[] P00GH2_A129BarCod ;
   private String[] P00GH2_A2792TermiCod ;
   private String[] P00GH2_A396EmprCod ;
   private short[] P00GH2_A2800BarPrfULi2 ;
   private boolean[] P00GH2_n2800BarPrfULi2 ;
}

final  class pinspro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GH2", "SELECT BarLinMaq, BarMaqPrf, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfULi2 FROM TXPBARMAQ WHERE (EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarLinMaq <> ?) AND (BarMaqPrf = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00GH3", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfRec, BarPrfH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P00GH4", "UPDATE TXPBARPR2 SET BarPrfCod=?  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? and BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new UpdateCursor("P00GH5", "UPDATE TXPBARMAQ SET BarPrfULi2=?  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

