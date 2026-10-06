package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcenviodeensayoaclienteexportcsv", "/app.wcenviodeensayoaclienteexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcenviodeensayoaclienteexportcsv extends GXWebObjectStub
{
   public wcenviodeensayoaclienteexportcsv( )
   {
   }

   public wcenviodeensayoaclienteexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcenviodeensayoaclienteexportcsv.class ));
   }

   public wcenviodeensayoaclienteexportcsv( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcenviodeensayoaclienteexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcenviodeensayoaclienteexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCEnviode Ensayoa Cliente Export CSV";
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

