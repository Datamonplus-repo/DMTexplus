package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tterpeswwexportcsv", "/app.tterpeswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tterpeswwexportcsv extends GXWebObjectStub
{
   public tterpeswwexportcsv( )
   {
   }

   public tterpeswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tterpeswwexportcsv.class ));
   }

   public tterpeswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tterpeswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tterpeswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTERPESWWExport CSV";
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

