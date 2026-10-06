package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pseqdc extends GXProcedure
{
   public pseqdc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pseqdc.class ), "" );
   }

   public pseqdc( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 )
   {
      pseqdc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      pseqdc.this.A396EmprCod = aP0;
      pseqdc.this.A602MaqCod = aP1;
      pseqdc.this.A11438MaqEquCod = aP2;
      pseqdc.this.A11439MaqSEqCod = aP3;
      pseqdc.this.AV9MaqSEqDsc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9MaqSEqDsc = "" ;
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P0AQZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11441MaqSEqDsc = P0AQZ2_A11441MaqSEqDsc[0] ;
         A11440MaqPieCod = P0AQZ2_A11440MaqPieCod[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV9MaqSEqDsc = A11441MaqSEqDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         AV9MaqSEqDsc = ((GXutil.strcmp("", A11439MaqSEqCod)==0) ? " " : httpContext.getMessage( "Error SubEquipo", "")) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pseqdc.this.AV9MaqSEqDsc;
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
      P0AQZ2_A396EmprCod = new String[] {""} ;
      P0AQZ2_A602MaqCod = new String[] {""} ;
      P0AQZ2_A11438MaqEquCod = new String[] {""} ;
      P0AQZ2_A11439MaqSEqCod = new String[] {""} ;
      P0AQZ2_A11441MaqSEqDsc = new String[] {""} ;
      P0AQZ2_A11440MaqPieCod = new String[] {""} ;
      A11441MaqSEqDsc = "" ;
      A11440MaqPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pseqdc__default(),
         new Object[] {
             new Object[] {
            P0AQZ2_A396EmprCod, P0AQZ2_A602MaqCod, P0AQZ2_A11438MaqEquCod, P0AQZ2_A11439MaqSEqCod, P0AQZ2_A11441MaqSEqDsc, P0AQZ2_A11440MaqPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11438MaqEquCod ;
   private String A11439MaqSEqCod ;
   private String AV9MaqSEqDsc ;
   private String scmdbuf ;
   private String A11441MaqSEqDsc ;
   private String A11440MaqPieCod ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQZ2_A396EmprCod ;
   private String[] P0AQZ2_A602MaqCod ;
   private String[] P0AQZ2_A11438MaqEquCod ;
   private String[] P0AQZ2_A11439MaqSEqCod ;
   private String[] P0AQZ2_A11441MaqSEqDsc ;
   private String[] P0AQZ2_A11440MaqPieCod ;
}

final  class pseqdc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQZ2", "SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqSEqDsc, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = ? and MaqSEqCod = ? ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               return;
      }
   }

}

