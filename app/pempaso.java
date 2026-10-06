package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pempaso extends GXProcedure
{
   public pempaso( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pempaso.class ), "" );
   }

   public pempaso( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           String[] aP2 )
   {
      pempaso.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pempaso.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pempaso.this.AV10EmprCod2 = aP1[0];
      this.aP1 = aP1;
      pempaso.this.AV9EmprNom2 = aP2[0];
      this.aP2 = aP2;
      pempaso.this.AV11Flag_Emp2 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10EmprCod2 = "" ;
      AV9EmprNom2 = "" ;
      AV11Flag_Emp2 = (byte)(0) ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV12Asocia)) ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ASOCIA", ""), GXv_int1) ;
      pempaso.this.AV12Asocia = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      if ( AV12Asocia.doubleValue() == 1 )
      {
         GXv_char2[0] = AV13ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ASOCIA", ""), GXv_char2) ;
         pempaso.this.AV13ContDsc = GXv_char2[0] ;
         if ( GXutil.strcmp(AV13ContDsc, " ") != 0 )
         {
            AV10EmprCod2 = GXutil.substring( AV13ContDsc, 1, 3) ;
         }
         /* Using cursor P02602 */
         pr_default.execute(0, new Object[] {AV10EmprCod2});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P02602_A396EmprCod[0] ;
            A962Emp0 = P02602_A962Emp0[0] ;
            n962Emp0 = P02602_n962Emp0[0] ;
            A407EmprNom = P02602_A407EmprNom[0] ;
            n407EmprNom = P02602_n407EmprNom[0] ;
            AV9EmprNom2 = A407EmprNom ;
            AV11Flag_Emp2 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pempaso.this.AV8EmprCod;
      this.aP1[0] = pempaso.this.AV10EmprCod2;
      this.aP2[0] = pempaso.this.AV9EmprNom2;
      this.aP3[0] = pempaso.this.AV11Flag_Emp2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Asocia = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV13ContDsc = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P02602_A396EmprCod = new String[] {""} ;
      P02602_A962Emp0 = new String[] {""} ;
      P02602_n962Emp0 = new boolean[] {false} ;
      P02602_A407EmprNom = new String[] {""} ;
      P02602_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A962Emp0 = "" ;
      A407EmprNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pempaso__default(),
         new Object[] {
             new Object[] {
            P02602_A396EmprCod, P02602_A962Emp0, P02602_n962Emp0, P02602_A407EmprNom, P02602_n407EmprNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Flag_Emp2 ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private java.math.BigDecimal AV12Asocia ;
   private String AV8EmprCod ;
   private String AV10EmprCod2 ;
   private String AV9EmprNom2 ;
   private String AV13ContDsc ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A962Emp0 ;
   private String A407EmprNom ;
   private boolean n962Emp0 ;
   private boolean n407EmprNom ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02602_A396EmprCod ;
   private String[] P02602_A962Emp0 ;
   private boolean[] P02602_n962Emp0 ;
   private String[] P02602_A407EmprNom ;
   private boolean[] P02602_n407EmprNom ;
}

final  class pempaso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02602", "SELECT EmprCod, Emp0, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
      }
   }

}

