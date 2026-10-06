package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie2wwexportreport", "/app.tdevpie2wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie2wwexportreport extends GXWebObjectStub
{
   public tdevpie2wwexportreport( )
   {
   }

   public tdevpie2wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie2wwexportreport.class ));
   }

   public tdevpie2wwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie2wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie2wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDev Pie2 WWExport Report";
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

