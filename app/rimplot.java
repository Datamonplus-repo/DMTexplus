package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rimplot", "/app.rimplot"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rimplot extends GXWebObjectStub
{
   public rimplot( )
   {
   }

   public rimplot( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rimplot.class ));
   }

   public rimplot( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rimplot_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rimplot_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "IMPRESION LOTE";
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

