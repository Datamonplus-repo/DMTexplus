package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmformulaswwexportreport", "/app.tmformulaswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmformulaswwexportreport extends GXWebObjectStub
{
   public tmformulaswwexportreport( )
   {
   }

   public tmformulaswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmformulaswwexportreport.class ));
   }

   public tmformulaswwexportreport( int remoteHandle ,
                                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmformulaswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmformulaswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMFormulas WWExport Report";
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

