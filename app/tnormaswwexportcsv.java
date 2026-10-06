package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnormaswwexportcsv", "/app.tnormaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnormaswwexportcsv extends GXWebObjectStub
{
   public tnormaswwexportcsv( )
   {
   }

   public tnormaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnormaswwexportcsv.class ));
   }

   public tnormaswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnormaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnormaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNORMASWWExport CSV";
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

