package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterminwwexportcsv", "/app.tterminwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterminwwexportcsv extends GXWebObjectStub
{
   public tterminwwexportcsv( )
   {
   }

   public tterminwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterminwwexportcsv.class ));
   }

   public tterminwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterminwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterminwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERMINWWExport CSV";
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

