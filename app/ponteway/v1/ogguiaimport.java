package app.ponteway.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ponteway.v1.ogguiaimport", "/app.ponteway.v1.ogguiaimport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ogguiaimport extends GXWebObjectStub
{
   public ogguiaimport( )
   {
   }

   public ogguiaimport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ogguiaimport.class ));
   }

   public ogguiaimport( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ogguiaimport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ogguiaimport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Oliveira Gonçalo Guia Remesa";
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

