package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getmtoforumatinteprocesso extends GXProcedure
{
   public getmtoforumatinteprocesso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getmtoforumatinteprocesso.class ), "" );
   }

   public getmtoforumatinteprocesso( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            String aP3 ,
                            int aP4 ,
                            byte aP5 )
   {
      getmtoforumatinteprocesso.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short[] aP6 )
   {
      getmtoforumatinteprocesso.this.AV8EmprCod = aP0;
      getmtoforumatinteprocesso.this.AV9CliCod = aP1;
      getmtoforumatinteprocesso.this.AV10ForSer = aP2;
      getmtoforumatinteprocesso.this.AV11ForColNom = aP3;
      getmtoforumatinteprocesso.this.AV12ForColNum = aP4;
      getmtoforumatinteprocesso.this.AV13TipColCod = aP5;
      getmtoforumatinteprocesso.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15AuxProForL = (short)(0) ;
      /* Using cursor P0ADL2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV10ForSer, AV11ForColNom, Integer.valueOf(AV12ForColNum), Byte.valueOf(AV13TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P0ADL2_A831TipColCod[0] ;
         A483ForColNum = P0ADL2_A483ForColNum[0] ;
         A482ForColNom = P0ADL2_A482ForColNom[0] ;
         A494ForSer = P0ADL2_A494ForSer[0] ;
         A252CliCod = P0ADL2_A252CliCod[0] ;
         A396EmprCod = P0ADL2_A396EmprCod[0] ;
         A1160ProForL = P0ADL2_A1160ProForL[0] ;
         AV15AuxProForL = A1160ProForL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV15AuxProForL = (short)(AV15AuxProForL+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = getmtoforumatinteprocesso.this.AV15AuxProForL;
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
      P0ADL2_A831TipColCod = new byte[1] ;
      P0ADL2_A483ForColNum = new int[1] ;
      P0ADL2_A482ForColNom = new String[] {""} ;
      P0ADL2_A494ForSer = new String[] {""} ;
      P0ADL2_A252CliCod = new int[1] ;
      P0ADL2_A396EmprCod = new String[] {""} ;
      P0ADL2_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.getmtoforumatinteprocesso__default(),
         new Object[] {
             new Object[] {
            P0ADL2_A831TipColCod, P0ADL2_A483ForColNum, P0ADL2_A482ForColNom, P0ADL2_A494ForSer, P0ADL2_A252CliCod, P0ADL2_A396EmprCod, P0ADL2_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13TipColCod ;
   private byte A831TipColCod ;
   private short AV15AuxProForL ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV12ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV8EmprCod ;
   private String AV10ForSer ;
   private String AV11ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0ADL2_A831TipColCod ;
   private int[] P0ADL2_A483ForColNum ;
   private String[] P0ADL2_A482ForColNom ;
   private String[] P0ADL2_A494ForSer ;
   private int[] P0ADL2_A252CliCod ;
   private String[] P0ADL2_A396EmprCod ;
   private short[] P0ADL2_A1160ProForL ;
}

final  class getmtoforumatinteprocesso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADL2", "SELECT * FROM (SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ProForL DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
      }
   }

}

