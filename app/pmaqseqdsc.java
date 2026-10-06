package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqseqdsc extends GXProcedure
{
   public pmaqseqdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqseqdsc.class ), "" );
   }

   public pmaqseqdsc( int remoteHandle ,
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
      pmaqseqdsc.this.aP4 = new String[] {""};
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
      pmaqseqdsc.this.A396EmprCod = aP0;
      pmaqseqdsc.this.A602MaqCod = aP1;
      pmaqseqdsc.this.A11438MaqEquCod = aP2;
      pmaqseqdsc.this.A11439MaqSEqCod = aP3;
      pmaqseqdsc.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P04JI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11440MaqPieCod = P04JI2_A11440MaqPieCod[0] ;
         A11441MaqSEqDsc = P04JI2_A11441MaqSEqDsc[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8MaqSEqDsc = A11441MaqSEqDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8MaqSEqDsc = httpContext.getMessage( "Error N/E Sub Equipo", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pmaqseqdsc.this.AV8MaqSEqDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MaqSEqDsc = "" ;
      scmdbuf = "" ;
      P04JI2_A396EmprCod = new String[] {""} ;
      P04JI2_A602MaqCod = new String[] {""} ;
      P04JI2_A11438MaqEquCod = new String[] {""} ;
      P04JI2_A11439MaqSEqCod = new String[] {""} ;
      P04JI2_A11440MaqPieCod = new String[] {""} ;
      P04JI2_A11441MaqSEqDsc = new String[] {""} ;
      A11440MaqPieCod = "" ;
      A11441MaqSEqDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqseqdsc__default(),
         new Object[] {
             new Object[] {
            P04JI2_A396EmprCod, P04JI2_A602MaqCod, P04JI2_A11438MaqEquCod, P04JI2_A11439MaqSEqCod, P04JI2_A11440MaqPieCod, P04JI2_A11441MaqSEqDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl1 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11438MaqEquCod ;
   private String A11439MaqSEqCod ;
   private String AV8MaqSEqDsc ;
   private String scmdbuf ;
   private String A11440MaqPieCod ;
   private String A11441MaqSEqDsc ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JI2_A396EmprCod ;
   private String[] P04JI2_A602MaqCod ;
   private String[] P04JI2_A11438MaqEquCod ;
   private String[] P04JI2_A11439MaqSEqCod ;
   private String[] P04JI2_A11440MaqPieCod ;
   private String[] P04JI2_A11441MaqSEqDsc ;
}

final  class pmaqseqdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JI2", "SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod, MaqSEqDsc FROM TXPMaqPie WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = ? and MaqSEqCod = ? and MaqPieCod = '   ' ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
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

