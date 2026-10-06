package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedido_trnwwexportreport", "/app.tpedido_trnwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedido_trnwwexportreport extends GXWebObjectStub
{
   public tpedido_trnwwexportreport( )
   {
   }

   public tpedido_trnwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedido_trnwwexportreport.class ));
   }

   public tpedido_trnwwexportreport( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedido_trnwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedido_trnwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPEDIDO_Trn WWExport Report";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

