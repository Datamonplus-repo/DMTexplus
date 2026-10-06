package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparartp extends GXProcedure
{
   public pparartp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparartp.class ), "" );
   }

   public pparartp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pparartp.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pparartp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparartp.this.A758ProCod = aP1[0];
      this.aP1 = aP1;
      pparartp.this.AV8Pronumlin = aP2[0];
      this.aP2 = aP2;
      pparartp.this.AV9Fascod = aP3[0];
      this.aP3 = aP3;
      pparartp.this.AV10FasDsc = aP4[0];
      this.aP4 = aP4;
      pparartp.this.AV11Err_msg = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Err_msg = httpContext.getMessage( "Error", "") ;
      /* Using cursor P02PO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(AV8Pronumlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A774ProNumLin = P02PO2_A774ProNumLin[0] ;
         A457FasCod = P02PO2_A457FasCod[0] ;
         A460FasDsc = P02PO2_A460FasDsc[0] ;
         A460FasDsc = P02PO2_A460FasDsc[0] ;
         AV9Fascod = A457FasCod ;
         AV10FasDsc = A460FasDsc ;
         AV11Err_msg = " " ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparartp.this.A396EmprCod;
      this.aP1[0] = pparartp.this.A758ProCod;
      this.aP2[0] = pparartp.this.AV8Pronumlin;
      this.aP3[0] = pparartp.this.AV9Fascod;
      this.aP4[0] = pparartp.this.AV10FasDsc;
      this.aP5[0] = pparartp.this.AV11Err_msg;
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
      P02PO2_A396EmprCod = new String[] {""} ;
      P02PO2_A758ProCod = new String[] {""} ;
      P02PO2_A774ProNumLin = new short[1] ;
      P02PO2_A457FasCod = new String[] {""} ;
      P02PO2_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparartp__default(),
         new Object[] {
             new Object[] {
            P02PO2_A396EmprCod, P02PO2_A758ProCod, P02PO2_A774ProNumLin, P02PO2_A457FasCod, P02PO2_A460FasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Pronumlin ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String AV9Fascod ;
   private String AV10FasDsc ;
   private String AV11Err_msg ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02PO2_A396EmprCod ;
   private String[] P02PO2_A758ProCod ;
   private short[] P02PO2_A774ProNumLin ;
   private String[] P02PO2_A457FasCod ;
   private String[] P02PO2_A460FasDsc ;
}

final  class pparartp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PO2", "SELECT T1.EmprCod, T1.ProCod, T1.ProNumLin, T1.FasCod, T2.FasDsc FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? and T1.ProNumLin = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

