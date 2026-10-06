package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pttmqpr extends GXProcedure
{
   public pttmqpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pttmqpr.class ), "" );
   }

   public pttmqpr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 )
   {
      pttmqpr.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      pttmqpr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pttmqpr.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pttmqpr.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pttmqpr.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pttmqpr.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pttmqpr.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pttmqpr.this.AV12BarMaqCod = aP6[0];
      this.aP6 = aP6;
      pttmqpr.this.AV8TiempoT = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TiempoT = (short)(0) ;
      /* Using cursor P032G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1514MacProCod = P032G2_A1514MacProCod[0] ;
         n1514MacProCod = P032G2_n1514MacProCod[0] ;
         AV13Macprocod = A1514MacProCod ;
         /* Execute user subroutine: 'MAQPRG' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV8TiempoT = AV14Maq_Tt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQPRG' Routine */
      returnInSub = false ;
      AV14Maq_Tt = (short)(0) ;
      /* Using cursor P032G3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV12BarMaqCod, AV13Macprocod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A8008Maq_Prg = P032G3_A8008Maq_Prg[0] ;
         A602MaqCod = P032G3_A602MaqCod[0] ;
         A8007Maq_Tt = P032G3_A8007Maq_Tt[0] ;
         n8007Maq_Tt = P032G3_n8007Maq_Tt[0] ;
         AV14Maq_Tt = A8007Maq_Tt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pttmqpr.this.A396EmprCod;
      this.aP1[0] = pttmqpr.this.A252CliCod;
      this.aP2[0] = pttmqpr.this.A494ForSer;
      this.aP3[0] = pttmqpr.this.A482ForColNom;
      this.aP4[0] = pttmqpr.this.A483ForColNum;
      this.aP5[0] = pttmqpr.this.A831TipColCod;
      this.aP6[0] = pttmqpr.this.AV12BarMaqCod;
      this.aP7[0] = pttmqpr.this.AV8TiempoT;
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
      P032G2_A396EmprCod = new String[] {""} ;
      P032G2_A252CliCod = new int[1] ;
      P032G2_A494ForSer = new String[] {""} ;
      P032G2_A482ForColNom = new String[] {""} ;
      P032G2_A483ForColNum = new int[1] ;
      P032G2_A831TipColCod = new byte[1] ;
      P032G2_A1514MacProCod = new String[] {""} ;
      P032G2_n1514MacProCod = new boolean[] {false} ;
      A1514MacProCod = "" ;
      AV13Macprocod = "" ;
      P032G3_A396EmprCod = new String[] {""} ;
      P032G3_A8008Maq_Prg = new String[] {""} ;
      P032G3_A602MaqCod = new String[] {""} ;
      P032G3_A8007Maq_Tt = new short[1] ;
      P032G3_n8007Maq_Tt = new boolean[] {false} ;
      A8008Maq_Prg = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pttmqpr__default(),
         new Object[] {
             new Object[] {
            P032G2_A396EmprCod, P032G2_A252CliCod, P032G2_A494ForSer, P032G2_A482ForColNom, P032G2_A483ForColNum, P032G2_A831TipColCod, P032G2_A1514MacProCod, P032G2_n1514MacProCod
            }
            , new Object[] {
            P032G3_A396EmprCod, P032G3_A8008Maq_Prg, P032G3_A602MaqCod, P032G3_A8007Maq_Tt, P032G3_n8007Maq_Tt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV8TiempoT ;
   private short AV14Maq_Tt ;
   private short A8007Maq_Tt ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV12BarMaqCod ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private String AV13Macprocod ;
   private String A8008Maq_Prg ;
   private String A602MaqCod ;
   private boolean n1514MacProCod ;
   private boolean returnInSub ;
   private boolean n8007Maq_Tt ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P032G2_A396EmprCod ;
   private int[] P032G2_A252CliCod ;
   private String[] P032G2_A494ForSer ;
   private String[] P032G2_A482ForColNom ;
   private int[] P032G2_A483ForColNum ;
   private byte[] P032G2_A831TipColCod ;
   private String[] P032G2_A1514MacProCod ;
   private boolean[] P032G2_n1514MacProCod ;
   private String[] P032G3_A396EmprCod ;
   private String[] P032G3_A8008Maq_Prg ;
   private String[] P032G3_A602MaqCod ;
   private short[] P032G3_A8007Maq_Tt ;
   private boolean[] P032G3_n8007Maq_Tt ;
}

final  class pttmqpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P032G2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P032G3", "SELECT EmprCod, Maq_Prg, MaqCod, Maq_Tt FROM TXPMAQPRG WHERE EmprCod = ? and MaqCod = ? and Maq_Prg = ? ORDER BY EmprCod, MaqCod, Maq_Prg ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

