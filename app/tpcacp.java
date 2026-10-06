package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpcacp", "/app.tpcacp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpcacp extends GXWebObjectStub
{
   public tpcacp( )
   {
   }

   public tpcacp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpcacp.class ));
   }

   public tpcacp( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpcacp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpcacp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO CLIENTE-ARTIGO-COR-PROC";
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

