package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_ultimafecha extends GXProcedure
{
   public documentotransporteproveedor_ultimafecha( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_ultimafecha.class ), "" );
   }

   public documentotransporteproveedor_ultimafecha( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 )
   {
      documentotransporteproveedor_ultimafecha.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             java.util.Date[] aP1 )
   {
      documentotransporteproveedor_ultimafecha.this.AV8emprcod = aP0;
      documentotransporteproveedor_ultimafecha.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10albprodate = GXutil.nullDate() ;
      /* Using cursor P0AK72 */
      pr_default.execute(0, new Object[] {AV8emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AK72_A396EmprCod[0] ;
         A13430AlbProDate = P0AK72_A13430AlbProDate[0] ;
         A13418AlbProID = P0AK72_A13418AlbProID[0] ;
         AV10albprodate = A13430AlbProDate ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = documentotransporteproveedor_ultimafecha.this.AV10albprodate;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10albprodate = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AK72_A396EmprCod = new String[] {""} ;
      P0AK72_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P0AK72_A13418AlbProID = new int[1] ;
      A396EmprCod = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_ultimafecha__default(),
         new Object[] {
             new Object[] {
            P0AK72_A396EmprCod, P0AK72_A13430AlbProDate, P0AK72_A13418AlbProID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13418AlbProID ;
   private String AV8emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV10albprodate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK72_A396EmprCod ;
   private java.util.Date[] P0AK72_A13430AlbProDate ;
   private int[] P0AK72_A13418AlbProID ;
}

final  class documentotransporteproveedor_ultimafecha__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK72", "SELECT * FROM (SELECT EmprCod, AlbProDate, AlbProID FROM TXPCALPRO WHERE EmprCod = ? ORDER BY EmprCod, AlbProDate DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
      }
   }

}

