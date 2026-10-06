package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerempresaprovisional extends GXProcedure
{
   public obtenerempresaprovisional( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerempresaprovisional.class ), "" );
   }

   public obtenerempresaprovisional( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      obtenerempresaprovisional.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      obtenerempresaprovisional.this.AV11EmprCod = aP0[0];
      this.aP0 = aP0;
      obtenerempresaprovisional.this.AV12EmprcodPaso = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P07WX2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A395EmprCif = P07WX2_A395EmprCif[0] ;
         n395EmprCif = P07WX2_n395EmprCif[0] ;
         A396EmprCod = P07WX2_A396EmprCod[0] ;
         AV11EmprCod = A396EmprCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12EmprcodPaso = AV11EmprCod ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = obtenerempresaprovisional.this.AV11EmprCod;
      this.aP1[0] = obtenerempresaprovisional.this.AV12EmprcodPaso;
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
      P07WX2_A395EmprCif = new String[] {""} ;
      P07WX2_n395EmprCif = new boolean[] {false} ;
      P07WX2_A396EmprCod = new String[] {""} ;
      A395EmprCif = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtenerempresaprovisional__default(),
         new Object[] {
             new Object[] {
            P07WX2_A395EmprCif, P07WX2_n395EmprCif, P07WX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV11EmprCod ;
   private String AV12EmprcodPaso ;
   private String scmdbuf ;
   private String A395EmprCif ;
   private String A396EmprCod ;
   private boolean n395EmprCif ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P07WX2_A395EmprCif ;
   private boolean[] P07WX2_n395EmprCif ;
   private String[] P07WX2_A396EmprCod ;
}

final  class obtenerempresaprovisional__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07WX2", "SELECT * FROM (SELECT EmprCif, EmprCod FROM TXPEMPRES ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

