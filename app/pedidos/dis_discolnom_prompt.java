package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis_discolnom_prompt", "/app.pedidos.dis_discolnom_prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis_discolnom_prompt extends GXWebObjectStub
{
   public dis_discolnom_prompt( )
   {
   }

   public dis_discolnom_prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis_discolnom_prompt.class ));
   }

   public dis_discolnom_prompt( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis_discolnom_prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis_discolnom_prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selección de colores";
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

