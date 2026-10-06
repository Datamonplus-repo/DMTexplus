package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprocedwwexportcsv", "/app.tprocedwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprocedwwexportcsv extends GXWebObjectStub
{
   public tprocedwwexportcsv( )
   {
   }

   public tprocedwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprocedwwexportcsv.class ));
   }

   public tprocedwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprocedwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprocedwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPROCEDWWExport CSV";
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

