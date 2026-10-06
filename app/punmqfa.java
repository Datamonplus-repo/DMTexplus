package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class punmqfa extends GXProcedure
{
   public punmqfa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( punmqfa.class ), "" );
   }

   public punmqfa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      punmqfa.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      punmqfa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      punmqfa.this.A602MaqCod = aP1[0];
      this.aP1 = aP1;
      punmqfa.this.AV8MaqFasUni = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01NN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1257MaqFasUni = P01NN2_A1257MaqFasUni[0] ;
         n1257MaqFasUni = P01NN2_n1257MaqFasUni[0] ;
         AV8MaqFasUni = A1257MaqFasUni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = punmqfa.this.A396EmprCod;
      this.aP1[0] = punmqfa.this.A602MaqCod;
      this.aP2[0] = punmqfa.this.AV8MaqFasUni;
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
      P01NN2_A396EmprCod = new String[] {""} ;
      P01NN2_A602MaqCod = new String[] {""} ;
      P01NN2_A1257MaqFasUni = new String[] {""} ;
      P01NN2_n1257MaqFasUni = new boolean[] {false} ;
      A1257MaqFasUni = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.punmqfa__default(),
         new Object[] {
             new Object[] {
            P01NN2_A396EmprCod, P01NN2_A602MaqCod, P01NN2_A1257MaqFasUni, P01NN2_n1257MaqFasUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV8MaqFasUni ;
   private String scmdbuf ;
   private String A1257MaqFasUni ;
   private boolean n1257MaqFasUni ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01NN2_A396EmprCod ;
   private String[] P01NN2_A602MaqCod ;
   private String[] P01NN2_A1257MaqFasUni ;
   private boolean[] P01NN2_n1257MaqFasUni ;
}

final  class punmqfa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01NN2", "SELECT EmprCod, MaqCod, MaqFasUni FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
      }
   }

}

