package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuplamaq extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuplamaq pgm = new apuplamaq (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public apuplamaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuplamaq.class ), "" );
   }

   public apuplamaq( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      apuplamaq.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      apuplamaq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apuplamaq.this.AV11MaqCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03922 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P03922_A602MaqCod[0] ;
         A1011TipMaqCod = P03922_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P03922_n1011TipMaqCod[0] ;
         if ( GXutil.strcmp(A1011TipMaqCod, httpContext.getMessage( "TN", "")) == 0 )
         {
            if ( GXutil.strcmp(A602MaqCod, httpContext.getMessage( "TIAI04", "")) != 0 )
            {
               AV12PlaMTAOrd = (short)(0) ;
               /* Using cursor P03923 */
               pr_default.execute(1, new Object[] {A396EmprCod, A602MaqCod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A5879PlaMTAOrd = P03923_A5879PlaMTAOrd[0] ;
                  AV12PlaMTAOrd = A5879PlaMTAOrd ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               /*
                  INSERT RECORD ON TABLE TXPPlaMaq

               */
               W396EmprCod = A396EmprCod ;
               W602MaqCod = A602MaqCod ;
               A396EmprCod = "001" ;
               A5879PlaMTAOrd = (short)(AV12PlaMTAOrd+1) ;
               A5880PlaMTACnd = httpContext.getMessage( "SERIE = 'SK 0355'", "") ;
               n5880PlaMTACnd = false ;
               A5881PlaMTAMin = 1 ;
               n5881PlaMTAMin = false ;
               A5882PlaMTAMax = 0 ;
               n5882PlaMTAMax = false ;
               A6457PlaMTAAca = " " ;
               n6457PlaMTAAca = false ;
               /* Using cursor P03924 */
               pr_default.execute(2, new Object[] {A396EmprCod, A602MaqCod, Short.valueOf(A5879PlaMTAOrd), Boolean.valueOf(n5880PlaMTACnd), A5880PlaMTACnd, Boolean.valueOf(n5881PlaMTAMin), Integer.valueOf(A5881PlaMTAMin), Boolean.valueOf(n5882PlaMTAMax), Integer.valueOf(A5882PlaMTAMax), Boolean.valueOf(n6457PlaMTAAca), A6457PlaMTAAca});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaMaq");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A602MaqCod = W602MaqCod ;
               /* End Insert */
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puplamaq.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apuplamaq.this.A396EmprCod;
      this.aP1[0] = apuplamaq.this.AV11MaqCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apuplamaq");
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
      P03922_A602MaqCod = new String[] {""} ;
      P03922_A396EmprCod = new String[] {""} ;
      P03922_A1011TipMaqCod = new String[] {""} ;
      P03922_n1011TipMaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A1011TipMaqCod = "" ;
      P03923_A396EmprCod = new String[] {""} ;
      P03923_A602MaqCod = new String[] {""} ;
      P03923_A5879PlaMTAOrd = new short[1] ;
      W396EmprCod = "" ;
      W602MaqCod = "" ;
      A5880PlaMTACnd = "" ;
      A6457PlaMTAAca = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuplamaq__default(),
         new Object[] {
             new Object[] {
            P03922_A602MaqCod, P03922_A396EmprCod, P03922_A1011TipMaqCod, P03922_n1011TipMaqCod
            }
            , new Object[] {
            P03923_A396EmprCod, P03923_A602MaqCod, P03923_A5879PlaMTAOrd
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12PlaMTAOrd ;
   private short A5879PlaMTAOrd ;
   private short Gx_err ;
   private int GX_INS862 ;
   private int A5881PlaMTAMin ;
   private int A5882PlaMTAMax ;
   private String A396EmprCod ;
   private String AV11MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private String W396EmprCod ;
   private String W602MaqCod ;
   private String A6457PlaMTAAca ;
   private String Gx_emsg ;
   private boolean n1011TipMaqCod ;
   private boolean n5880PlaMTACnd ;
   private boolean n5881PlaMTAMin ;
   private boolean n5882PlaMTAMax ;
   private boolean n6457PlaMTAAca ;
   private String A5880PlaMTACnd ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03922_A602MaqCod ;
   private String[] P03922_A396EmprCod ;
   private String[] P03922_A1011TipMaqCod ;
   private boolean[] P03922_n1011TipMaqCod ;
   private String[] P03923_A396EmprCod ;
   private String[] P03923_A602MaqCod ;
   private short[] P03923_A5879PlaMTAOrd ;
}

final  class apuplamaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03922", "SELECT MaqCod, EmprCod, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = '001' ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03923", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, PlaMTAOrd DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03924", "INSERT INTO TXPPlaMaq(EmprCod, MaqCod, PlaMTAOrd, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca, PlaMTADsc) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPlaMaq")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 2000);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 1);
               }
               return;
      }
   }

}

