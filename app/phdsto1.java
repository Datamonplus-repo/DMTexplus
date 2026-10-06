package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdsto1 extends GXProcedure
{
   public phdsto1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdsto1.class ), "" );
   }

   public phdsto1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      phdsto1.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      phdsto1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdsto1.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      phdsto1.this.AV10Barcodreo = aP2[0];
      this.aP2 = aP2;
      phdsto1.this.AV11Barcodpar = aP3[0];
      this.aP3 = aP3;
      phdsto1.this.AV8Stp_mot = aP4[0];
      this.aP4 = aP4;
      phdsto1.this.AV13Usurcod = aP5[0];
      this.aP5 = aP5;
      phdsto1.this.AV14Station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Stp_ultl = (short)(0) ;
      AV17GXLvl4 = (byte)(0) ;
      /* Using cursor P041Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10748Stp_p = P041Z2_A10748Stp_p[0] ;
         A10747Stp_r = P041Z2_A10747Stp_r[0] ;
         A10746Stp_hdr = P041Z2_A10746Stp_hdr[0] ;
         A10749Stp_ultL = P041Z2_A10749Stp_ultL[0] ;
         n10749Stp_ultL = P041Z2_n10749Stp_ultL[0] ;
         AV17GXLvl4 = (byte)(1) ;
         AV12Stp_ultl = (short)(A10749Stp_ultL+1) ;
         A10749Stp_ultL = AV12Stp_ultl ;
         n10749Stp_ultL = false ;
         /* Using cursor P041Z3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n10749Stp_ultL), Short.valueOf(A10749Stp_ultL), A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTOP");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV17GXLvl4 == 0 )
      {
         AV12Stp_ultl = (short)(1) ;
         /*
            INSERT RECORD ON TABLE TXPHDSTOP

         */
         A10746Stp_hdr = AV9Barcod ;
         A10747Stp_r = AV10Barcodreo ;
         A10748Stp_p = AV11Barcodpar ;
         A10749Stp_ultL = (short)(1) ;
         n10749Stp_ultL = false ;
         /* Using cursor P041Z4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Boolean.valueOf(n10749Stp_ultL), Short.valueOf(A10749Stp_ultL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTOP");
         if ( (pr_default.getStatus(2) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPHDSTO1

      */
      A10746Stp_hdr = AV9Barcod ;
      A10747Stp_r = AV10Barcodreo ;
      A10748Stp_p = AV11Barcodpar ;
      A10750Stp_Lin = AV12Stp_ultl ;
      A10751Stp_Dia = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10752Stp_Mot = AV8Stp_mot ;
      A10753Stp_Term = AV14Station ;
      A10754Stp_Usu = AV13Usurcod ;
      A10755Stp_Est = (byte)(1) ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      /* Using cursor P041Z5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10746Stp_hdr), Byte.valueOf(A10747Stp_r), A10748Stp_p, Short.valueOf(A10750Stp_Lin), A10751Stp_Dia, A10752Stp_Mot, A10753Stp_Term, A10754Stp_Usu, Byte.valueOf(A10755Stp_Est), A10756Stp_DiaA, A10757Stp_MotA});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDSTO1");
      if ( (pr_default.getStatus(3) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdsto1.this.A396EmprCod;
      this.aP1[0] = phdsto1.this.AV9Barcod;
      this.aP2[0] = phdsto1.this.AV10Barcodreo;
      this.aP3[0] = phdsto1.this.AV11Barcodpar;
      this.aP4[0] = phdsto1.this.AV8Stp_mot;
      this.aP5[0] = phdsto1.this.AV13Usurcod;
      this.aP6[0] = phdsto1.this.AV14Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdsto1");
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
      P041Z2_A396EmprCod = new String[] {""} ;
      P041Z2_A10748Stp_p = new String[] {""} ;
      P041Z2_A10747Stp_r = new byte[1] ;
      P041Z2_A10746Stp_hdr = new int[1] ;
      P041Z2_A10749Stp_ultL = new short[1] ;
      P041Z2_n10749Stp_ultL = new boolean[] {false} ;
      A10748Stp_p = "" ;
      Gx_emsg = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10753Stp_Term = "" ;
      A10754Stp_Usu = "" ;
      A10756Stp_DiaA = GXutil.resetTime( GXutil.nullDate() );
      A10757Stp_MotA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdsto1__default(),
         new Object[] {
             new Object[] {
            P041Z2_A396EmprCod, P041Z2_A10748Stp_p, P041Z2_A10747Stp_r, P041Z2_A10746Stp_hdr, P041Z2_A10749Stp_ultL, P041Z2_n10749Stp_ultL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte AV17GXLvl4 ;
   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short AV12Stp_ultl ;
   private short A10749Stp_ultL ;
   private short Gx_err ;
   private short A10750Stp_Lin ;
   private int AV9Barcod ;
   private int A10746Stp_hdr ;
   private int GX_INS1429 ;
   private int GX_INS1430 ;
   private String A396EmprCod ;
   private String AV11Barcodpar ;
   private String AV13Usurcod ;
   private String AV14Station ;
   private String scmdbuf ;
   private String A10748Stp_p ;
   private String Gx_emsg ;
   private String A10753Stp_Term ;
   private String A10754Stp_Usu ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date A10756Stp_DiaA ;
   private boolean n10749Stp_ultL ;
   private String AV8Stp_mot ;
   private String A10752Stp_Mot ;
   private String A10757Stp_MotA ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P041Z2_A396EmprCod ;
   private String[] P041Z2_A10748Stp_p ;
   private byte[] P041Z2_A10747Stp_r ;
   private int[] P041Z2_A10746Stp_hdr ;
   private short[] P041Z2_A10749Stp_ultL ;
   private boolean[] P041Z2_n10749Stp_ultL ;
}

final  class phdsto1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P041Z2", "SELECT EmprCod, Stp_p, Stp_r, Stp_hdr, Stp_ultL FROM TXPHDSTOP WHERE EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ? ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P041Z3", "UPDATE TXPHDSTOP SET Stp_ultL=?  WHERE EmprCod = ? AND Stp_hdr = ? AND Stp_r = ? AND Stp_p = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDSTOP")
         ,new UpdateCursor("P041Z4", "INSERT INTO TXPHDSTOP(EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_ultL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDSTOP")
         ,new UpdateCursor("P041Z5", "INSERT INTO TXPHDSTO1(EmprCod, Stp_hdr, Stp_r, Stp_p, Stp_Lin, Stp_Dia, Stp_Mot, Stp_Term, Stp_Usu, Stp_Est, Stp_DiaA, Stp_MotA, Stp_UsuAct, Stp_TermAc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDSTO1")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setVarchar(7, (String)parms[6], 300, false);
               stmt.setString(8, (String)parms[7], 10);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setDateTime(11, (java.util.Date)parms[10], false);
               stmt.setVarchar(12, (String)parms[11], 300, false);
               return;
      }
   }

}

