package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrtcc extends GXProcedure
{
   public pctrtcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrtcc.class ), "" );
   }

   public pctrtcc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 )
   {
      pctrtcc.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pctrtcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrtcc.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pctrtcc.this.AV9ForSer = aP2[0];
      this.aP2 = aP2;
      pctrtcc.this.AV10ForColNom = aP3[0];
      this.aP3 = aP3;
      pctrtcc.this.AV11ForColNum = aP4[0];
      this.aP4 = aP4;
      pctrtcc.this.AV12TipColCod = aP5[0];
      this.aP5 = aP5;
      pctrtcc.this.AV13F_tc = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13F_tc = (byte)(0) ;
      /* Using cursor P023U2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV11ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A483ForColNum = P023U2_A483ForColNum[0] ;
         A482ForColNom = P023U2_A482ForColNom[0] ;
         A494ForSer = P023U2_A494ForSer[0] ;
         A252CliCod = P023U2_A252CliCod[0] ;
         A831TipColCod = P023U2_A831TipColCod[0] ;
         if ( A831TipColCod != AV12TipColCod )
         {
            AV13F_tc = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrtcc.this.A396EmprCod;
      this.aP1[0] = pctrtcc.this.AV8CliCod;
      this.aP2[0] = pctrtcc.this.AV9ForSer;
      this.aP3[0] = pctrtcc.this.AV10ForColNom;
      this.aP4[0] = pctrtcc.this.AV11ForColNum;
      this.aP5[0] = pctrtcc.this.AV12TipColCod;
      this.aP6[0] = pctrtcc.this.AV13F_tc;
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
      P023U2_A396EmprCod = new String[] {""} ;
      P023U2_A483ForColNum = new int[1] ;
      P023U2_A482ForColNom = new String[] {""} ;
      P023U2_A494ForSer = new String[] {""} ;
      P023U2_A252CliCod = new int[1] ;
      P023U2_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrtcc__default(),
         new Object[] {
             new Object[] {
            P023U2_A396EmprCod, P023U2_A483ForColNum, P023U2_A482ForColNom, P023U2_A494ForSer, P023U2_A252CliCod, P023U2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColCod ;
   private byte AV13F_tc ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P023U2_A396EmprCod ;
   private int[] P023U2_A483ForColNum ;
   private String[] P023U2_A482ForColNom ;
   private String[] P023U2_A494ForSer ;
   private int[] P023U2_A252CliCod ;
   private byte[] P023U2_A831TipColCod ;
}

final  class pctrtcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P023U2", "SELECT EmprCod, ForColNum, ForColNom, ForSer, CliCod, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               return;
      }
   }

}

