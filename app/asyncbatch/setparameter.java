package app.asyncbatch ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class setparameter extends GXProcedure
{
   public setparameter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( setparameter.class ), "" );
   }

   public setparameter( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( app.asyncbatch.SdtJobParameterData aP0 )
   {
      setparameter.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( app.asyncbatch.SdtJobParameterData aP0 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( app.asyncbatch.SdtJobParameterData aP0 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 )
   {
      setparameter.this.AV11JobData = aP0;
      setparameter.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8JobId = AV11JobData.getgxTv_SdtJobParameterData_Jobid() ;
      AV15x = (short)(0) ;
      AV19GXV1 = 1 ;
      while ( AV19GXV1 <= AV11JobData.getgxTv_SdtJobParameterData_Jobparsdt().size() )
      {
         AV14JobDataItem = (app.asyncbatch.SdtJobParameterData_JobParSdtItem)((app.asyncbatch.SdtJobParameterData_JobParSdtItem)AV11JobData.getgxTv_SdtJobParameterData_Jobparsdt().elementAt(-1+AV19GXV1));
         AV15x = (short)(AV15x+1) ;
         AV20GXLvl10 = (byte)(0) ;
         n14480ValTyp = false ;
         n14479ParVal = false ;
         /* Optimized UPDATE. */
         /* Using cursor P0AO92 */
         pr_default.execute(0, new Object[] {Boolean.valueOf(n14480ValTyp), AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp(), Boolean.valueOf(n14479ParVal), AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parval(), AV8JobId, AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parkey()});
         if ( (pr_default.getStatus(0) != 101) )
         {
            AV20GXLvl10 = (byte)(1) ;
         }
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBPAR");
         /* End optimized UPDATE. */
         if ( AV20GXLvl10 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPJOBPAR

            */
            A14423JobId = AV8JobId ;
            A14478ParKey = AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parkey() ;
            A14479ParVal = AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Parval() ;
            n14479ParVal = false ;
            A14480ValTyp = AV14JobDataItem.getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp() ;
            n14480ValTyp = false ;
            /* Using cursor P0AO93 */
            pr_default.execute(1, new Object[] {A14423JobId, A14478ParKey, Boolean.valueOf(n14479ParVal), A14479ParVal, Boolean.valueOf(n14480ValTyp), A14480ValTyp});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOBPAR");
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
            /* End Insert */
         }
         Application.commitDataStores(context, remoteHandle, pr_default, "asyncbatch.setparameter");
         AV19GXV1 = (int)(AV19GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = setparameter.this.AV9Messages;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV8JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV14JobDataItem = new app.asyncbatch.SdtJobParameterData_JobParSdtItem(remoteHandle, context);
      A14480ValTyp = "" ;
      A14479ParVal = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14478ParKey = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.setparameter__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.setparameter__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.setparameter__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.asyncbatch.setparameter__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl10 ;
   private short AV15x ;
   private short Gx_err ;
   private int AV19GXV1 ;
   private int GX_INS1909 ;
   private String Gx_emsg ;
   private boolean n14480ValTyp ;
   private boolean n14479ParVal ;
   private String A14480ValTyp ;
   private String A14479ParVal ;
   private String A14478ParKey ;
   private java.util.UUID AV8JobId ;
   private java.util.UUID A14423JobId ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV9Messages ;
   private app.asyncbatch.SdtJobParameterData AV11JobData ;
   private app.asyncbatch.SdtJobParameterData_JobParSdtItem AV14JobDataItem ;
}

final  class setparameter__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class setparameter__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class setparameter__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class setparameter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AO92", "UPDATE TXPJOBPAR SET ValTyp=?, ParVal=?  WHERE JobId = ? and ParKey = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOBPAR")
         ,new UpdateCursor("P0AO93", "INSERT INTO TXPJOBPAR(JobId, ParKey, ParVal, ValTyp) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPJOBPAR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 400);
               }
               stmt.setGUID(3, (java.util.UUID)parms[4]);
               stmt.setVarchar(4, (String)parms[5], 100);
               return;
            case 1 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               stmt.setVarchar(2, (String)parms[1], 40, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 400);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               return;
      }
   }

}

