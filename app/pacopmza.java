package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacopmza extends GXProcedure
{
   public pacopmza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacopmza.class ), "" );
   }

   public pacopmza( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      pacopmza.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pacopmza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacopmza.this.AV8Dibcli = aP1[0];
      this.aP1 = aP1;
      pacopmza.this.AV9CliCod = aP2[0];
      this.aP2 = aP2;
      pacopmza.this.AV10DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "In Pacopmza", "") );
      if ( ( ! ( GXutil.like( AV8Dibcli , GXutil.padr( httpContext.getMessage( "_MX%", "") , 254 , "%"),  ' ' ) ) ) )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_char2[0] = AV8Dibcli ;
         GXv_int3[0] = AV9CliCod ;
         GXv_int4[0] = AV10DibInt ;
         new app.pactdib(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4) ;
         pacopmza.this.A396EmprCod = GXv_char1[0] ;
         pacopmza.this.AV8Dibcli = GXv_char2[0] ;
         pacopmza.this.AV9CliCod = GXv_int3[0] ;
         pacopmza.this.AV10DibInt = GXv_int4[0] ;
         /* Using cursor P02XI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8Dibcli, Integer.valueOf(AV10DibInt), Integer.valueOf(AV9CliCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1014DibInt = P02XI2_A1014DibInt[0] ;
            A252CliCod = P02XI2_A252CliCod[0] ;
            A1013DibCli = P02XI2_A1013DibCli[0] ;
            /* Optimized DELETE. */
            /* Using cursor P02XI3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUC");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P02XI4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDIBUJ");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P02XI5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIBOBS");
            /* End optimized DELETE. */
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P02XI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV8Dibcli, Integer.valueOf(AV10DibInt), Integer.valueOf(AV9CliCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1014DibInt = P02XI6_A1014DibInt[0] ;
            A252CliCod = P02XI6_A252CliCod[0] ;
            A1013DibCli = P02XI6_A1013DibCli[0] ;
            System.out.println( httpContext.getMessage( "In PCOPLIN", "") );
            GXv_char2[0] = A396EmprCod ;
            GXv_char1[0] = AV8Dibcli ;
            GXv_int4[0] = AV9CliCod ;
            GXv_int3[0] = AV10DibInt ;
            GXv_char5[0] = A1013DibCli ;
            GXv_int6[0] = A252CliCod ;
            GXv_int7[0] = A1014DibInt ;
            GXv_int8[0] = (byte)(0) ;
            new app.pcoplin(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_int4, GXv_int3, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
            pacopmza.this.A396EmprCod = GXv_char2[0] ;
            pacopmza.this.AV8Dibcli = GXv_char1[0] ;
            pacopmza.this.AV9CliCod = GXv_int4[0] ;
            pacopmza.this.AV10DibInt = GXv_int3[0] ;
            pacopmza.this.A1013DibCli = GXv_char5[0] ;
            pacopmza.this.A252CliCod = GXv_int6[0] ;
            pacopmza.this.A1014DibInt = GXv_int7[0] ;
            System.out.println( httpContext.getMessage( "End PCOPLIN", "") );
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P02XI7 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV8Dibcli, Integer.valueOf(AV10DibInt)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A7503AMDibInt = P02XI7_A7503AMDibInt[0] ;
            A7502AMDibCli = P02XI7_A7502AMDibCli[0] ;
            A1013DibCli = P02XI7_A1013DibCli[0] ;
            A252CliCod = P02XI7_A252CliCod[0] ;
            A1014DibInt = P02XI7_A1014DibInt[0] ;
            A7504AMCliCod = P02XI7_A7504AMCliCod[0] ;
            System.out.println( httpContext.getMessage( "In PARMMZA", "") );
            GXv_char5[0] = A396EmprCod ;
            GXv_char2[0] = A1013DibCli ;
            GXv_int7[0] = A252CliCod ;
            GXv_int6[0] = A1014DibInt ;
            new app.parmmza(remoteHandle, context).execute( GXv_char5, GXv_char2, GXv_int7, GXv_int6) ;
            pacopmza.this.A396EmprCod = GXv_char5[0] ;
            pacopmza.this.A1013DibCli = GXv_char2[0] ;
            pacopmza.this.A252CliCod = GXv_int7[0] ;
            pacopmza.this.A1014DibInt = GXv_int6[0] ;
            System.out.println( httpContext.getMessage( "End PARMMZA", "") );
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      System.out.println( httpContext.getMessage( "End Pacopmza", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacopmza.this.A396EmprCod;
      this.aP1[0] = pacopmza.this.AV8Dibcli;
      this.aP2[0] = pacopmza.this.AV9CliCod;
      this.aP3[0] = pacopmza.this.AV10DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacopmza");
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
      P02XI2_A396EmprCod = new String[] {""} ;
      P02XI2_A1014DibInt = new int[1] ;
      P02XI2_A252CliCod = new int[1] ;
      P02XI2_A1013DibCli = new String[] {""} ;
      A1013DibCli = "" ;
      P02XI6_A396EmprCod = new String[] {""} ;
      P02XI6_A1014DibInt = new int[1] ;
      P02XI6_A252CliCod = new int[1] ;
      P02XI6_A1013DibCli = new String[] {""} ;
      GXv_char1 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_int8 = new byte[1] ;
      P02XI7_A396EmprCod = new String[] {""} ;
      P02XI7_A7503AMDibInt = new int[1] ;
      P02XI7_A7502AMDibCli = new String[] {""} ;
      P02XI7_A1013DibCli = new String[] {""} ;
      P02XI7_A252CliCod = new int[1] ;
      P02XI7_A1014DibInt = new int[1] ;
      P02XI7_A7504AMCliCod = new int[1] ;
      A7502AMDibCli = "" ;
      GXv_char5 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacopmza__default(),
         new Object[] {
             new Object[] {
            P02XI2_A396EmprCod, P02XI2_A1014DibInt, P02XI2_A252CliCod, P02XI2_A1013DibCli
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02XI6_A396EmprCod, P02XI6_A1014DibInt, P02XI6_A252CliCod, P02XI6_A1013DibCli
            }
            , new Object[] {
            P02XI7_A396EmprCod, P02XI7_A7503AMDibInt, P02XI7_A7502AMDibCli, P02XI7_A1013DibCli, P02XI7_A252CliCod, P02XI7_A1014DibInt, P02XI7_A7504AMCliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int8[] ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV10DibInt ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int GXv_int4[] ;
   private int GXv_int3[] ;
   private int A7503AMDibInt ;
   private int A7504AMCliCod ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String AV8Dibcli ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String GXv_char1[] ;
   private String A7502AMDibCli ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02XI2_A396EmprCod ;
   private int[] P02XI2_A1014DibInt ;
   private int[] P02XI2_A252CliCod ;
   private String[] P02XI2_A1013DibCli ;
   private String[] P02XI6_A396EmprCod ;
   private int[] P02XI6_A1014DibInt ;
   private int[] P02XI6_A252CliCod ;
   private String[] P02XI6_A1013DibCli ;
   private String[] P02XI7_A396EmprCod ;
   private int[] P02XI7_A7503AMDibInt ;
   private String[] P02XI7_A7502AMDibCli ;
   private String[] P02XI7_A1013DibCli ;
   private int[] P02XI7_A252CliCod ;
   private int[] P02XI7_A1014DibInt ;
   private int[] P02XI7_A7504AMCliCod ;
}

final  class pacopmza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XI2", "SELECT EmprCod, DibInt, CliCod, DibCli FROM TXPCDIBUJ WHERE (EmprCod = ? and DibCli = ? and DibInt = ?) AND (CliCod <> ?) ORDER BY EmprCod, DibCli, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02XI3", "DELETE FROM TXPLDIBUC  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUC")
         ,new UpdateCursor("P02XI4", "DELETE FROM TXPLDIBUJ  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDIBUJ")
         ,new UpdateCursor("P02XI5", "DELETE FROM TXPDIBOBS  WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIBOBS")
         ,new ForEachCursor("P02XI6", "SELECT EmprCod, DibInt, CliCod, DibCli FROM TXPCDIBUJ WHERE (EmprCod = ? and DibCli = ? and DibInt = ?) AND (CliCod <> ?) ORDER BY EmprCod, DibCli, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02XI7", "SELECT EmprCod, AMDibInt, AMDibCli, DibCli, CliCod, DibInt, AMCliCod FROM TXPARTMZA WHERE (EmprCod = ?) AND (AMDibCli = ?) AND (AMDibInt = ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

