package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class descripcionprocesoyactivo extends GXProcedure
{
   public descripcionprocesoyactivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( descripcionprocesoyactivo.class ), "" );
   }

   public descripcionprocesoyactivo( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      descripcionprocesoyactivo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      descripcionprocesoyactivo.this.A396EmprCod = aP0;
      descripcionprocesoyactivo.this.A758ProCod = aP1;
      descripcionprocesoyactivo.this.aP2 = aP2;
      descripcionprocesoyactivo.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ProAct = "I" ;
      AV12GXLvl3 = (byte)(0) ;
      /* Using cursor P0AGK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A759ProDsc = P0AGK2_A759ProDsc[0] ;
         A14284ProEst = P0AGK2_A14284ProEst[0] ;
         AV12GXLvl3 = (byte)(1) ;
         AV8ProDsc = A759ProDsc ;
         AV9ProAct = A14284ProEst ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12GXLvl3 == 0 )
      {
         AV8ProDsc = httpContext.getMessage( "No existe proceso", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = descripcionprocesoyactivo.this.AV8ProDsc;
      this.aP3[0] = descripcionprocesoyactivo.this.AV9ProAct;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ProDsc = "" ;
      AV9ProAct = "" ;
      scmdbuf = "" ;
      P0AGK2_A396EmprCod = new String[] {""} ;
      P0AGK2_A758ProCod = new String[] {""} ;
      P0AGK2_A759ProDsc = new String[] {""} ;
      P0AGK2_A14284ProEst = new String[] {""} ;
      A759ProDsc = "" ;
      A14284ProEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.descripcionprocesoyactivo__default(),
         new Object[] {
             new Object[] {
            P0AGK2_A396EmprCod, P0AGK2_A758ProCod, P0AGK2_A759ProDsc, P0AGK2_A14284ProEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl3 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV8ProDsc ;
   private String AV9ProAct ;
   private String scmdbuf ;
   private String A759ProDsc ;
   private String A14284ProEst ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGK2_A396EmprCod ;
   private String[] P0AGK2_A758ProCod ;
   private String[] P0AGK2_A759ProDsc ;
   private String[] P0AGK2_A14284ProEst ;
}

final  class descripcionprocesoyactivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGK2", "SELECT EmprCod, ProCod, ProDsc, ProEst FROM TXPPROCES WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

