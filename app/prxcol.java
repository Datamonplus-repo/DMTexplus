package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prxcol extends GXProcedure
{
   public prxcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prxcol.class ), "" );
   }

   public prxcol( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 )
   {
      prxcol.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      prxcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prxcol.this.A494ForSer = aP1[0];
      this.aP1 = aP1;
      prxcol.this.AV8ForColNum = aP2[0];
      this.aP2 = aP2;
      prxcol.this.AV9ForColNom = aP3[0];
      this.aP3 = aP3;
      prxcol.this.AV10TipColCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14GXLvl1 = (byte)(0) ;
      /* Using cursor P02192 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8ForColNum), A494ForSer});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A483ForColNum = P02192_A483ForColNum[0] ;
         A482ForColNom = P02192_A482ForColNom[0] ;
         A831TipColCod = P02192_A831TipColCod[0] ;
         A252CliCod = P02192_A252CliCod[0] ;
         AV14GXLvl1 = (byte)(1) ;
         AV9ForColNom = A482ForColNom ;
         AV10TipColCod = A831TipColCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14GXLvl1 == 0 )
      {
         AV9ForColNom = httpContext.getMessage( "No Existe", "") ;
         AV10TipColCod = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prxcol.this.A396EmprCod;
      this.aP1[0] = prxcol.this.A494ForSer;
      this.aP2[0] = prxcol.this.AV8ForColNum;
      this.aP3[0] = prxcol.this.AV9ForColNom;
      this.aP4[0] = prxcol.this.AV10TipColCod;
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
      P02192_A396EmprCod = new String[] {""} ;
      P02192_A494ForSer = new String[] {""} ;
      P02192_A483ForColNum = new int[1] ;
      P02192_A482ForColNom = new String[] {""} ;
      P02192_A831TipColCod = new byte[1] ;
      P02192_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prxcol__default(),
         new Object[] {
             new Object[] {
            P02192_A396EmprCod, P02192_A494ForSer, P02192_A483ForColNum, P02192_A482ForColNom, P02192_A831TipColCod, P02192_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TipColCod ;
   private byte AV14GXLvl1 ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV8ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String AV9ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02192_A396EmprCod ;
   private String[] P02192_A494ForSer ;
   private int[] P02192_A483ForColNum ;
   private String[] P02192_A482ForColNom ;
   private byte[] P02192_A831TipColCod ;
   private int[] P02192_A252CliCod ;
}

final  class prxcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02192", "SELECT EmprCod, ForSer, ForColNum, ForColNom, TipColCod, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and ForColNum = ?) AND (ForSer = ?) ORDER BY EmprCod, ForColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               return;
      }
   }

}

