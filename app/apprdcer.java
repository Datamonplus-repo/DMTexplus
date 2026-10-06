package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprdcer extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprdcer pgm = new apprdcer (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprdcer( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprdcer.class ), "" );
   }

   public apprdcer( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03RM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P03RM2_A719PrdNum[0] ;
         A396EmprCod = P03RM2_A396EmprCod[0] ;
         A728PrdRefPrv = P03RM2_A728PrdRefPrv[0] ;
         AV8PrdRefprv = A728PrdRefPrv ;
         /* Execute user subroutine: 'CERTI' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV9Ct_codigo > 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPPRDCER

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            A9711Ct_codigo = AV9Ct_codigo ;
            /* Using cursor P03RM3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A9711Ct_codigo)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDCER");
            if ( (pr_default.getStatus(1) == 1) )
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
            A719PrdNum = W719PrdNum ;
            /* End Insert */
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CERTI' Routine */
      returnInSub = false ;
      AV9Ct_codigo = (short)(0) ;
      /* Using cursor P03RM4 */
      pr_default.execute(2, new Object[] {AV8PrdRefprv});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9712Ct_Desc = P03RM4_A9712Ct_Desc[0] ;
         n9712Ct_Desc = P03RM4_n9712Ct_Desc[0] ;
         A396EmprCod = P03RM4_A396EmprCod[0] ;
         A9711Ct_codigo = P03RM4_A9711Ct_codigo[0] ;
         AV9Ct_codigo = A9711Ct_codigo ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprdcer.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apprdcer");
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
      P03RM2_A719PrdNum = new String[] {""} ;
      P03RM2_A396EmprCod = new String[] {""} ;
      P03RM2_A728PrdRefPrv = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A728PrdRefPrv = "" ;
      AV8PrdRefprv = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      Gx_emsg = "" ;
      P03RM4_A9712Ct_Desc = new String[] {""} ;
      P03RM4_n9712Ct_Desc = new boolean[] {false} ;
      P03RM4_A396EmprCod = new String[] {""} ;
      P03RM4_A9711Ct_codigo = new short[1] ;
      A9712Ct_Desc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprdcer__default(),
         new Object[] {
             new Object[] {
            P03RM2_A719PrdNum, P03RM2_A396EmprCod, P03RM2_A728PrdRefPrv
            }
            , new Object[] {
            }
            , new Object[] {
            P03RM4_A9712Ct_Desc, P03RM4_n9712Ct_Desc, P03RM4_A396EmprCod, P03RM4_A9711Ct_codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9Ct_codigo ;
   private short A9711Ct_codigo ;
   private short Gx_err ;
   private int GX_INS1268 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A728PrdRefPrv ;
   private String AV8PrdRefprv ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private String A9712Ct_Desc ;
   private boolean returnInSub ;
   private boolean n9712Ct_Desc ;
   private IDataStoreProvider pr_default ;
   private String[] P03RM2_A719PrdNum ;
   private String[] P03RM2_A396EmprCod ;
   private String[] P03RM2_A728PrdRefPrv ;
   private String[] P03RM4_A9712Ct_Desc ;
   private boolean[] P03RM4_n9712Ct_Desc ;
   private String[] P03RM4_A396EmprCod ;
   private short[] P03RM4_A9711Ct_codigo ;
}

final  class apprdcer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03RM2", "SELECT PrdNum, EmprCod, PrdRefPrv FROM TXPPRODUC WHERE (EmprCod = '001') AND (PrdRefPrv <> ' ') ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03RM3", "INSERT INTO TXPPRDCER(EmprCod, PrdNum, Ct_codigo) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDCER")
         ,new ForEachCursor("P03RM4", "SELECT Ct_Desc, EmprCod, Ct_codigo FROM TXPCERTI WHERE (EmprCod = '001') AND (Ct_Desc = ?) ORDER BY EmprCod, Ct_codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 30);
               return;
      }
   }

}

