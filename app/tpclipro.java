package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpclipro", "/app.tpclipro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpclipro extends GXWebObjectStub
{
   public tpclipro( )
   {
   }

   public tpclipro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpclipro.class ));
   }

   public tpclipro( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpclipro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpclipro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIO CLIENTE-ART-PROCESO PARM";
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

