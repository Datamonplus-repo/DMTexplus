package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasbotnew extends GXProcedure
{
   public pfasbotnew( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasbotnew.class ), "" );
   }

   public pfasbotnew( int remoteHandle ,
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
                             short[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      pfasbotnew.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pfasbotnew.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasbotnew.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasbotnew.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasbotnew.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasbotnew.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pfasbotnew.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pfasbotnew.this.A10781BarFasNb = aP6[0];
      this.aP6 = aP6;
      pfasbotnew.this.AV12BarCod_d = aP7[0];
      this.aP7 = aP7;
      pfasbotnew.this.AV13CodReo_d = aP8[0];
      this.aP8 = aP8;
      pfasbotnew.this.AV14CodPar_d = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P046D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A10781BarFasNb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10789BarFasNbO = P046D2_A10789BarFasNbO[0] ;
         n10789BarFasNbO = P046D2_n10789BarFasNbO[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W10781BarFasNb = A10781BarFasNb ;
         /*
            INSERT RECORD ON TABLE TXPFASBOT

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W10781BarFasNb = A10781BarFasNb ;
         W10789BarFasNbO = A10789BarFasNbO ;
         n10789BarFasNbO = false ;
         A129BarCod = AV12BarCod_d ;
         A132BarCodReo = AV13CodReo_d ;
         A130BarCodPar = AV14CodPar_d ;
         n10789BarFasNbO = false ;
         /* Using cursor P046D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A10781BarFasNb), Boolean.valueOf(n10789BarFasNbO), A10789BarFasNbO});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASBOT");
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
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A10781BarFasNb = W10781BarFasNb ;
         A10789BarFasNbO = W10789BarFasNbO ;
         n10789BarFasNbO = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A10781BarFasNb = W10781BarFasNb ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasbotnew.this.A396EmprCod;
      this.aP1[0] = pfasbotnew.this.A129BarCod;
      this.aP2[0] = pfasbotnew.this.A132BarCodReo;
      this.aP3[0] = pfasbotnew.this.A130BarCodPar;
      this.aP4[0] = pfasbotnew.this.A758ProCod;
      this.aP5[0] = pfasbotnew.this.A194BarOrdLin;
      this.aP6[0] = pfasbotnew.this.A10781BarFasNb;
      this.aP7[0] = pfasbotnew.this.AV12BarCod_d;
      this.aP8[0] = pfasbotnew.this.AV13CodReo_d;
      this.aP9[0] = pfasbotnew.this.AV14CodPar_d;
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
      P046D2_A396EmprCod = new String[] {""} ;
      P046D2_A129BarCod = new int[1] ;
      P046D2_A132BarCodReo = new byte[1] ;
      P046D2_A130BarCodPar = new String[] {""} ;
      P046D2_A758ProCod = new String[] {""} ;
      P046D2_A194BarOrdLin = new short[1] ;
      P046D2_A10781BarFasNb = new int[1] ;
      P046D2_A10789BarFasNbO = new String[] {""} ;
      P046D2_n10789BarFasNbO = new boolean[] {false} ;
      A10789BarFasNbO = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W10789BarFasNbO = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasbotnew__default(),
         new Object[] {
             new Object[] {
            P046D2_A396EmprCod, P046D2_A129BarCod, P046D2_A132BarCodReo, P046D2_A130BarCodPar, P046D2_A758ProCod, P046D2_A194BarOrdLin, P046D2_A10781BarFasNb, P046D2_A10789BarFasNbO, P046D2_n10789BarFasNbO
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13CodReo_d ;
   private byte W132BarCodReo ;
   private short A194BarOrdLin ;
   private short W194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A10781BarFasNb ;
   private int AV12BarCod_d ;
   private int W129BarCod ;
   private int W10781BarFasNb ;
   private int GX_INS1432 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV14CodPar_d ;
   private String scmdbuf ;
   private String A10789BarFasNbO ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W10789BarFasNbO ;
   private String Gx_emsg ;
   private boolean n10789BarFasNbO ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P046D2_A396EmprCod ;
   private int[] P046D2_A129BarCod ;
   private byte[] P046D2_A132BarCodReo ;
   private String[] P046D2_A130BarCodPar ;
   private String[] P046D2_A758ProCod ;
   private short[] P046D2_A194BarOrdLin ;
   private int[] P046D2_A10781BarFasNb ;
   private String[] P046D2_A10789BarFasNbO ;
   private boolean[] P046D2_n10789BarFasNbO ;
}

final  class pfasbotnew__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P046D2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb, BarFasNbO FROM TXPFASBOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasNb = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P046D3", "INSERT INTO TXPFASBOT(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb, BarFasNbO) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASBOT")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 100);
               }
               return;
      }
   }

}

