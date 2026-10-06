package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctlfmaq extends GXProcedure
{
   public pctlfmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctlfmaq.class ), "" );
   }

   public pctlfmaq( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pctlfmaq.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pctlfmaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctlfmaq.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      pctlfmaq.this.A1142MaqFCod = aP2[0];
      this.aP2 = aP2;
      pctlfmaq.this.AV8Existe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = httpContext.getMessage( "N", "") ;
      /* Using cursor P01942 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A1142MaqFCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1143MaqFDsc = P01942_A1143MaqFDsc[0] ;
         AV8Existe = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctlfmaq.this.A396EmprCod;
      this.aP1[0] = pctlfmaq.this.A602MaqCod;
      this.aP2[0] = pctlfmaq.this.A1142MaqFCod;
      this.aP3[0] = pctlfmaq.this.AV8Existe;
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
      P01942_A396EmprCod = new String[] {""} ;
      P01942_A602MaqCod = new String[] {""} ;
      P01942_A1142MaqFCod = new String[] {""} ;
      P01942_A1143MaqFDsc = new String[] {""} ;
      A1143MaqFDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctlfmaq__default(),
         new Object[] {
             new Object[] {
            P01942_A396EmprCod, P01942_A602MaqCod, P01942_A1142MaqFCod, P01942_A1143MaqFDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1142MaqFCod ;
   private String AV8Existe ;
   private String scmdbuf ;
   private String A1143MaqFDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01942_A396EmprCod ;
   private String[] P01942_A602MaqCod ;
   private String[] P01942_A1142MaqFCod ;
   private String[] P01942_A1143MaqFDsc ;
}

final  class pctlfmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01942", "SELECT EmprCod, MaqCod, MaqFCod, MaqFDsc FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? and MaqFCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

