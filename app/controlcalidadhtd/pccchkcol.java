package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccchkcol extends GXProcedure
{
   public pccchkcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccchkcol.class ), "" );
   }

   public pccchkcol( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pccchkcol.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pccchkcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pccchkcol.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pccchkcol.this.AV11ForSer = aP2[0];
      this.aP2 = aP2;
      pccchkcol.this.AV8ForColNom = aP3[0];
      this.aP3 = aP3;
      pccchkcol.this.AV9ForColNum = aP4[0];
      this.aP4 = aP4;
      pccchkcol.this.AV10Ok = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXLvl2 = (byte)(0) ;
      /* Using cursor P013A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV11ForSer, AV11ForSer, AV8ForColNom, AV8ForColNom, Integer.valueOf(AV9ForColNum), Integer.valueOf(AV9ForColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A483ForColNum = P013A2_A483ForColNum[0] ;
         A482ForColNom = P013A2_A482ForColNom[0] ;
         A494ForSer = P013A2_A494ForSer[0] ;
         A831TipColCod = P013A2_A831TipColCod[0] ;
         AV14GXLvl2 = (byte)(1) ;
         AV10Ok = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14GXLvl2 == 0 )
      {
         AV10Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pccchkcol.this.A396EmprCod;
      this.aP1[0] = pccchkcol.this.A252CliCod;
      this.aP2[0] = pccchkcol.this.AV11ForSer;
      this.aP3[0] = pccchkcol.this.AV8ForColNom;
      this.aP4[0] = pccchkcol.this.AV9ForColNum;
      this.aP5[0] = pccchkcol.this.AV10Ok;
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
      P013A2_A396EmprCod = new String[] {""} ;
      P013A2_A252CliCod = new int[1] ;
      P013A2_A483ForColNum = new int[1] ;
      P013A2_A482ForColNom = new String[] {""} ;
      P013A2_A494ForSer = new String[] {""} ;
      P013A2_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.pccchkcol__default(),
         new Object[] {
             new Object[] {
            P013A2_A396EmprCod, P013A2_A252CliCod, P013A2_A483ForColNum, P013A2_A482ForColNom, P013A2_A494ForSer, P013A2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Ok ;
   private byte AV14GXLvl2 ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV9ForColNum ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String AV11ForSer ;
   private String AV8ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P013A2_A396EmprCod ;
   private int[] P013A2_A252CliCod ;
   private int[] P013A2_A483ForColNum ;
   private String[] P013A2_A482ForColNom ;
   private String[] P013A2_A494ForSer ;
   private byte[] P013A2_A831TipColCod ;
}

final  class pccchkcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P013A2", "SELECT EmprCod, CliCod, ForColNum, ForColNom, ForSer, TipColCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ?) AND (ForSer = ? or (rtrim(?) IS NULL)) AND (ForColNom = ? or (rtrim(?) IS NULL)) AND (ForColNum = ? or (? = 0)) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
      }
   }

}

