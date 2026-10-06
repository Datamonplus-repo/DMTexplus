package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclapfoc extends GXProcedure
{
   public pclapfoc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclapfoc.class ), "" );
   }

   public pclapfoc( int remoteHandle ,
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
      pclapfoc.this.aP6 = new byte[] {0};
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
      pclapfoc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclapfoc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclapfoc.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pclapfoc.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pclapfoc.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pclapfoc.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pclapfoc.this.AV8Ok = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P03GE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P03GE2_A764ProForCod[0] ;
         A1160ProForL = P03GE2_A1160ProForL[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclapfoc.this.A396EmprCod;
      this.aP1[0] = pclapfoc.this.A252CliCod;
      this.aP2[0] = pclapfoc.this.A494ForSer;
      this.aP3[0] = pclapfoc.this.A482ForColNom;
      this.aP4[0] = pclapfoc.this.A483ForColNum;
      this.aP5[0] = pclapfoc.this.A831TipColCod;
      this.aP6[0] = pclapfoc.this.AV8Ok;
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
      P03GE2_A396EmprCod = new String[] {""} ;
      P03GE2_A252CliCod = new int[1] ;
      P03GE2_A494ForSer = new String[] {""} ;
      P03GE2_A482ForColNom = new String[] {""} ;
      P03GE2_A483ForColNum = new int[1] ;
      P03GE2_A831TipColCod = new byte[1] ;
      P03GE2_A764ProForCod = new String[] {""} ;
      P03GE2_A1160ProForL = new short[1] ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclapfoc__default(),
         new Object[] {
             new Object[] {
            P03GE2_A396EmprCod, P03GE2_A252CliCod, P03GE2_A494ForSer, P03GE2_A482ForColNom, P03GE2_A483ForColNum, P03GE2_A831TipColCod, P03GE2_A764ProForCod, P03GE2_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8Ok ;
   private byte AV11GXLvl1 ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03GE2_A396EmprCod ;
   private int[] P03GE2_A252CliCod ;
   private String[] P03GE2_A494ForSer ;
   private String[] P03GE2_A482ForColNom ;
   private int[] P03GE2_A483ForColNum ;
   private byte[] P03GE2_A831TipColCod ;
   private String[] P03GE2_A764ProForCod ;
   private short[] P03GE2_A1160ProForL ;
}

final  class pclapfoc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03GE2", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
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

