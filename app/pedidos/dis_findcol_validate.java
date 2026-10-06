package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis_findcol_validate extends GXProcedure
{
   public dis_findcol_validate( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_findcol_validate.class ), "" );
   }

   public dis_findcol_validate( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 )
   {
      dis_findcol_validate.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String[] aP6 )
   {
      dis_findcol_validate.this.AV8emprcod = aP0;
      dis_findcol_validate.this.AV9clicod = aP1;
      dis_findcol_validate.this.AV13forser = aP2;
      dis_findcol_validate.this.AV10forcolnom = aP3;
      dis_findcol_validate.this.AV11forcolnum = aP4;
      dis_findcol_validate.this.AV12tipcolcod = aP5;
      dis_findcol_validate.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18GXLvl9 = (byte)(0) ;
      /* Using cursor P0A2B2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Integer.valueOf(AV9clicod), AV13forser, AV10forcolnom, Integer.valueOf(AV11forcolnum), Byte.valueOf(AV12tipcolcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P0A2B2_A831TipColCod[0] ;
         A483ForColNum = P0A2B2_A483ForColNum[0] ;
         A482ForColNom = P0A2B2_A482ForColNom[0] ;
         A494ForSer = P0A2B2_A494ForSer[0] ;
         A252CliCod = P0A2B2_A252CliCod[0] ;
         A396EmprCod = P0A2B2_A396EmprCod[0] ;
         AV18GXLvl9 = (byte)(1) ;
         AV15OutForSer = A494ForSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl9 == 0 )
      {
         AV15OutForSer = "xxx" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dis_findcol_validate.this.AV15OutForSer;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15OutForSer = "" ;
      scmdbuf = "" ;
      P0A2B2_A831TipColCod = new byte[1] ;
      P0A2B2_A483ForColNum = new int[1] ;
      P0A2B2_A482ForColNom = new String[] {""} ;
      P0A2B2_A494ForSer = new String[] {""} ;
      P0A2B2_A252CliCod = new int[1] ;
      P0A2B2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_findcol_validate__default(),
         new Object[] {
             new Object[] {
            P0A2B2_A831TipColCod, P0A2B2_A483ForColNum, P0A2B2_A482ForColNom, P0A2B2_A494ForSer, P0A2B2_A252CliCod, P0A2B2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12tipcolcod ;
   private byte AV18GXLvl9 ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV9clicod ;
   private int AV11forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV8emprcod ;
   private String AV13forser ;
   private String AV10forcolnom ;
   private String AV15OutForSer ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A2B2_A831TipColCod ;
   private int[] P0A2B2_A483ForColNum ;
   private String[] P0A2B2_A482ForColNom ;
   private String[] P0A2B2_A494ForSer ;
   private int[] P0A2B2_A252CliCod ;
   private String[] P0A2B2_A396EmprCod ;
}

final  class dis_findcol_validate__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2B2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

