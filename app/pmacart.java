package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacart extends GXProcedure
{
   public pmacart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacart.class ), "" );
   }

   public pmacart( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pmacart.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pmacart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacart.this.AV10ContCod = aP1[0];
      this.aP1 = aP1;
      pmacart.this.AV12MaccodId = aP2[0];
      this.aP2 = aP2;
      pmacart.this.AV9MsgErr = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04ZI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P04ZI2_A313ContCod[0] ;
         A316ContVal = P04ZI2_A316ContVal[0] ;
         AV11Contval = A316ContVal ;
         AV9MsgErr = ((AV8Maccod>AV11Contval) ? httpContext.getMessage( "Error. Numero Introducido ", "")+GXutil.str( AV12MaccodId, 8, 0)+httpContext.getMessage( " superior contador actual ", "")+GXutil.str( AV11Contval, 8, 0) : " ") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacart.this.A396EmprCod;
      this.aP1[0] = pmacart.this.AV10ContCod;
      this.aP2[0] = pmacart.this.AV12MaccodId;
      this.aP3[0] = pmacart.this.AV9MsgErr;
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
      P04ZI2_A396EmprCod = new String[] {""} ;
      P04ZI2_A313ContCod = new String[] {""} ;
      P04ZI2_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacart__default(),
         new Object[] {
             new Object[] {
            P04ZI2_A396EmprCod, P04ZI2_A313ContCod, P04ZI2_A316ContVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV12MaccodId ;
   private int A316ContVal ;
   private int AV11Contval ;
   private int AV8Maccod ;
   private String A396EmprCod ;
   private String AV10ContCod ;
   private String AV9MsgErr ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZI2_A396EmprCod ;
   private String[] P04ZI2_A313ContCod ;
   private int[] P04ZI2_A316ContVal ;
}

final  class pmacart__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZI2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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

