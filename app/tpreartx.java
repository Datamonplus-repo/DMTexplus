package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpreartx", "/app.tpreartx"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpreartx extends GXWebObjectStub
{
   public tpreartx( )
   {
   }

   public tpreartx( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpreartx.class ));
   }

   public tpreartx( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpreartx_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpreartx_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INSERTA FASE";
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

