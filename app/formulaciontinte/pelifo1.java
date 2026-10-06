package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelifo1 extends GXProcedure
{
   public pelifo1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelifo1.class ), "" );
   }

   public pelifo1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pelifo1.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pelifo1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelifo1.this.A486ForNumCol = aP1[0];
      this.aP1 = aP1;
      pelifo1.this.AV15Contador = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Contador = (byte)(0) ;
      /* Using cursor P00AP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A485ForFec = P00AP2_A485ForFec[0] ;
         n485ForFec = P00AP2_n485ForFec[0] ;
         A252CliCod = P00AP2_A252CliCod[0] ;
         A494ForSer = P00AP2_A494ForSer[0] ;
         A482ForColNom = P00AP2_A482ForColNom[0] ;
         A483ForColNum = P00AP2_A483ForColNum[0] ;
         A831TipColCod = P00AP2_A831TipColCod[0] ;
         AV15Contador = (byte)(AV15Contador+1) ;
         if ( AV15Contador == 2 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelifo1.this.A396EmprCod;
      this.aP1[0] = pelifo1.this.A486ForNumCol;
      this.aP2[0] = pelifo1.this.AV15Contador;
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
      P00AP2_A396EmprCod = new String[] {""} ;
      P00AP2_A486ForNumCol = new int[1] ;
      P00AP2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00AP2_n485ForFec = new boolean[] {false} ;
      P00AP2_A252CliCod = new int[1] ;
      P00AP2_A494ForSer = new String[] {""} ;
      P00AP2_A482ForColNom = new String[] {""} ;
      P00AP2_A483ForColNum = new int[1] ;
      P00AP2_A831TipColCod = new byte[1] ;
      A485ForFec = GXutil.nullDate() ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pelifo1__default(),
         new Object[] {
             new Object[] {
            P00AP2_A396EmprCod, P00AP2_A486ForNumCol, P00AP2_A485ForFec, P00AP2_n485ForFec, P00AP2_A252CliCod, P00AP2_A494ForSer, P00AP2_A482ForColNom, P00AP2_A483ForColNum, P00AP2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Contador ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private java.util.Date A485ForFec ;
   private boolean n485ForFec ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00AP2_A396EmprCod ;
   private int[] P00AP2_A486ForNumCol ;
   private java.util.Date[] P00AP2_A485ForFec ;
   private boolean[] P00AP2_n485ForFec ;
   private int[] P00AP2_A252CliCod ;
   private String[] P00AP2_A494ForSer ;
   private String[] P00AP2_A482ForColNom ;
   private int[] P00AP2_A483ForColNum ;
   private byte[] P00AP2_A831TipColCod ;
}

final  class pelifo1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00AP2", "SELECT EmprCod, ForNumCol, ForFec, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
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
               return;
      }
   }

}

