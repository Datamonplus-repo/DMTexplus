package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqequdsc extends GXProcedure
{
   public pmaqequdsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqequdsc.class ), "" );
   }

   public pmaqequdsc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pmaqequdsc.this.aP3 = new String[] {""};
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
      pmaqequdsc.this.A396EmprCod = aP0;
      pmaqequdsc.this.A602MaqCod = aP1;
      pmaqequdsc.this.A11438MaqEquCod = aP2;
      pmaqequdsc.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P04JF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11440MaqPieCod = P04JF2_A11440MaqPieCod[0] ;
         A11439MaqSEqCod = P04JF2_A11439MaqSEqCod[0] ;
         A11435MaqEquDsc = P04JF2_A11435MaqEquDsc[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8MaqEquDsc = A11435MaqEquDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8MaqEquDsc = httpContext.getMessage( "Error N/E Equipo", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pmaqequdsc.this.AV8MaqEquDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8MaqEquDsc = "" ;
      scmdbuf = "" ;
      P04JF2_A396EmprCod = new String[] {""} ;
      P04JF2_A602MaqCod = new String[] {""} ;
      P04JF2_A11438MaqEquCod = new String[] {""} ;
      P04JF2_A11440MaqPieCod = new String[] {""} ;
      P04JF2_A11439MaqSEqCod = new String[] {""} ;
      P04JF2_A11435MaqEquDsc = new String[] {""} ;
      A11440MaqPieCod = "" ;
      A11439MaqSEqCod = "" ;
      A11435MaqEquDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqequdsc__default(),
         new Object[] {
             new Object[] {
            P04JF2_A396EmprCod, P04JF2_A602MaqCod, P04JF2_A11438MaqEquCod, P04JF2_A11440MaqPieCod, P04JF2_A11439MaqSEqCod, P04JF2_A11435MaqEquDsc
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
   private String AV8MaqEquDsc ;
   private String scmdbuf ;
   private String A11440MaqPieCod ;
   private String A11439MaqSEqCod ;
   private String A11435MaqEquDsc ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JF2_A396EmprCod ;
   private String[] P04JF2_A602MaqCod ;
   private String[] P04JF2_A11438MaqEquCod ;
   private String[] P04JF2_A11440MaqPieCod ;
   private String[] P04JF2_A11439MaqSEqCod ;
   private String[] P04JF2_A11435MaqEquDsc ;
}

final  class pmaqequdsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JF2", "SELECT EmprCod, MaqCod, MaqEquCod, MaqPieCod, MaqSEqCod, MaqEquDsc FROM TXPMaqPie WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = ? and MaqSEqCod = '   ' and MaqPieCod = '    ' ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

