package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peqdc extends GXProcedure
{
   public peqdc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peqdc.class ), "" );
   }

   public peqdc( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      peqdc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      peqdc.this.A396EmprCod = aP0;
      peqdc.this.A602MaqCod = aP1;
      peqdc.this.A11438MaqEquCod = aP2;
      peqdc.this.AV8MaqEquDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MaqEquDsc = "" ;
      AV11GXLvl3 = (byte)(0) ;
      /* Using cursor P0AQY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11435MaqEquDsc = P0AQY2_A11435MaqEquDsc[0] ;
         A11439MaqSEqCod = P0AQY2_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0AQY2_A11440MaqPieCod[0] ;
         AV11GXLvl3 = (byte)(1) ;
         AV8MaqEquDsc = A11435MaqEquDsc ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11GXLvl3 == 0 )
      {
         AV8MaqEquDsc = ((GXutil.strcmp("", A11438MaqEquCod)==0) ? " " : httpContext.getMessage( "Error Equipo", "")) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = peqdc.this.AV8MaqEquDsc;
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
      P0AQY2_A396EmprCod = new String[] {""} ;
      P0AQY2_A602MaqCod = new String[] {""} ;
      P0AQY2_A11438MaqEquCod = new String[] {""} ;
      P0AQY2_A11435MaqEquDsc = new String[] {""} ;
      P0AQY2_A11439MaqSEqCod = new String[] {""} ;
      P0AQY2_A11440MaqPieCod = new String[] {""} ;
      A11435MaqEquDsc = "" ;
      A11439MaqSEqCod = "" ;
      A11440MaqPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peqdc__default(),
         new Object[] {
             new Object[] {
            P0AQY2_A396EmprCod, P0AQY2_A602MaqCod, P0AQY2_A11438MaqEquCod, P0AQY2_A11435MaqEquDsc, P0AQY2_A11439MaqSEqCod, P0AQY2_A11440MaqPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11438MaqEquCod ;
   private String AV8MaqEquDsc ;
   private String scmdbuf ;
   private String A11435MaqEquDsc ;
   private String A11439MaqSEqCod ;
   private String A11440MaqPieCod ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQY2_A396EmprCod ;
   private String[] P0AQY2_A602MaqCod ;
   private String[] P0AQY2_A11438MaqEquCod ;
   private String[] P0AQY2_A11435MaqEquDsc ;
   private String[] P0AQY2_A11439MaqSEqCod ;
   private String[] P0AQY2_A11440MaqPieCod ;
}

final  class peqdc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQY2", "SELECT EmprCod, MaqCod, MaqEquCod, MaqEquDsc, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = ? ORDER BY EmprCod, MaqCod, MaqEquCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
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
               return;
      }
   }

}

