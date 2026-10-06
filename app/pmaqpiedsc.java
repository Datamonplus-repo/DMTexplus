package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqpiedsc extends GXProcedure
{
   public pmaqpiedsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqpiedsc.class ), "" );
   }

   public pmaqpiedsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pmaqpiedsc.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pmaqpiedsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmaqpiedsc.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pmaqpiedsc.this.A11438MaqEquCod = aP2[0];
      this.aP2 = aP2;
      pmaqpiedsc.this.A11439MaqSEqCod = aP3[0];
      this.aP3 = aP3;
      pmaqpiedsc.this.A11440MaqPieCod = aP4[0];
      this.aP4 = aP4;
      pmaqpiedsc.this.AV8MaqPieDsc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P05CM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11436MaqPieDsc = P05CM2_A11436MaqPieDsc[0] ;
         n11436MaqPieDsc = P05CM2_n11436MaqPieDsc[0] ;
         AV11GXLvl2 = (byte)(1) ;
         AV8MaqPieDsc = A11436MaqPieDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8MaqPieDsc = httpContext.getMessage( "No Existe Pieza", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmaqpiedsc.this.A396EmprCod;
      this.aP1[0] = pmaqpiedsc.this.A602MaqCod;
      this.aP2[0] = pmaqpiedsc.this.A11438MaqEquCod;
      this.aP3[0] = pmaqpiedsc.this.A11439MaqSEqCod;
      this.aP4[0] = pmaqpiedsc.this.A11440MaqPieCod;
      this.aP5[0] = pmaqpiedsc.this.AV8MaqPieDsc;
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
      P05CM2_A396EmprCod = new String[] {""} ;
      P05CM2_A602MaqCod = new String[] {""} ;
      P05CM2_A11438MaqEquCod = new String[] {""} ;
      P05CM2_A11439MaqSEqCod = new String[] {""} ;
      P05CM2_A11440MaqPieCod = new String[] {""} ;
      P05CM2_A11436MaqPieDsc = new String[] {""} ;
      P05CM2_n11436MaqPieDsc = new boolean[] {false} ;
      A11436MaqPieDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqpiedsc__default(),
         new Object[] {
             new Object[] {
            P05CM2_A396EmprCod, P05CM2_A602MaqCod, P05CM2_A11438MaqEquCod, P05CM2_A11439MaqSEqCod, P05CM2_A11440MaqPieCod, P05CM2_A11436MaqPieDsc, P05CM2_n11436MaqPieDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11438MaqEquCod ;
   private String A11439MaqSEqCod ;
   private String A11440MaqPieCod ;
   private String AV8MaqPieDsc ;
   private String scmdbuf ;
   private String A11436MaqPieDsc ;
   private boolean n11436MaqPieDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05CM2_A396EmprCod ;
   private String[] P05CM2_A602MaqCod ;
   private String[] P05CM2_A11438MaqEquCod ;
   private String[] P05CM2_A11439MaqSEqCod ;
   private String[] P05CM2_A11440MaqPieCod ;
   private String[] P05CM2_A11436MaqPieDsc ;
   private boolean[] P05CM2_n11436MaqPieDsc ;
}

final  class pmaqpiedsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05CM2", "SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod, MaqPieDsc FROM TXPMaqPie WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = ? and MaqSEqCod = ? and MaqPieCod = ? ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 10);
               return;
      }
   }

}

