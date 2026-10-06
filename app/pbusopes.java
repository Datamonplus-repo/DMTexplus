package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusopes extends GXProcedure
{
   public pbusopes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusopes.class ), "" );
   }

   public pbusopes( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pbusopes.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pbusopes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusopes.this.AV8OpeCod = aP1[0];
      this.aP1 = aP1;
      pbusopes.this.AV9OpeNOm = aP2[0];
      this.aP2 = aP2;
      pbusopes.this.AV10Flag = aP3[0];
      this.aP3 = aP3;
      pbusopes.this.AV11Opesecc = aP4[0];
      this.aP4 = aP4;
      pbusopes.this.AV12Maqcod = aP5[0];
      this.aP5 = aP5;
      pbusopes.this.AV13Ok = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Opesecc = " " ;
      AV10Flag = (byte)(0) ;
      AV13Ok = "" ;
      /* Using cursor P038X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8OpeCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A652OpeCod = P038X2_A652OpeCod[0] ;
         A2505OpePreHor = P038X2_A2505OpePreHor[0] ;
         n2505OpePreHor = P038X2_n2505OpePreHor[0] ;
         A653OpeNom = P038X2_A653OpeNom[0] ;
         n653OpeNom = P038X2_n653OpeNom[0] ;
         A8422OpeSecc = P038X2_A8422OpeSecc[0] ;
         n8422OpeSecc = P038X2_n8422OpeSecc[0] ;
         AV9OpeNOm = A653OpeNom ;
         AV11Opesecc = A8422OpeSecc ;
         AV10Flag = (byte)(1) ;
         if ( GXutil.like( AV12Maqcod , GXutil.padr( A8422OpeSecc , 6 , "%"),  ' ' ) && ( GXutil.strcmp(A8422OpeSecc, " ") != 0 ) )
         {
            AV13Ok = httpContext.getMessage( "S", "") ;
         }
         else
         {
            AV13Ok = httpContext.getMessage( "N", "") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusopes.this.A396EmprCod;
      this.aP1[0] = pbusopes.this.AV8OpeCod;
      this.aP2[0] = pbusopes.this.AV9OpeNOm;
      this.aP3[0] = pbusopes.this.AV10Flag;
      this.aP4[0] = pbusopes.this.AV11Opesecc;
      this.aP5[0] = pbusopes.this.AV12Maqcod;
      this.aP6[0] = pbusopes.this.AV13Ok;
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
      P038X2_A396EmprCod = new String[] {""} ;
      P038X2_A652OpeCod = new int[1] ;
      P038X2_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038X2_n2505OpePreHor = new boolean[] {false} ;
      P038X2_A653OpeNom = new String[] {""} ;
      P038X2_n653OpeNom = new boolean[] {false} ;
      P038X2_A8422OpeSecc = new String[] {""} ;
      P038X2_n8422OpeSecc = new boolean[] {false} ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A653OpeNom = "" ;
      A8422OpeSecc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusopes__default(),
         new Object[] {
             new Object[] {
            P038X2_A396EmprCod, P038X2_A652OpeCod, P038X2_A2505OpePreHor, P038X2_n2505OpePreHor, P038X2_A653OpeNom, P038X2_n653OpeNom, P038X2_A8422OpeSecc, P038X2_n8422OpeSecc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Flag ;
   private short Gx_err ;
   private int AV8OpeCod ;
   private int A652OpeCod ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String A396EmprCod ;
   private String AV9OpeNOm ;
   private String AV11Opesecc ;
   private String AV12Maqcod ;
   private String AV13Ok ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private String A8422OpeSecc ;
   private boolean n2505OpePreHor ;
   private boolean n653OpeNom ;
   private boolean n8422OpeSecc ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P038X2_A396EmprCod ;
   private int[] P038X2_A652OpeCod ;
   private java.math.BigDecimal[] P038X2_A2505OpePreHor ;
   private boolean[] P038X2_n2505OpePreHor ;
   private String[] P038X2_A653OpeNom ;
   private boolean[] P038X2_n653OpeNom ;
   private String[] P038X2_A8422OpeSecc ;
   private boolean[] P038X2_n8422OpeSecc ;
}

final  class pbusopes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038X2", "SELECT EmprCod, OpeCod, OpePreHor, OpeNom, OpeSecc FROM TXPOPERAR WHERE EmprCod = ? and OpeCod = ? ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

