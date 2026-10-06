package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn20", "/app.ttrn20"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn20 extends GXWebObjectStub
{
   public ttrn20( )
   {
   }

   public ttrn20( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn20.class ));
   }

   public ttrn20( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn20_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn20_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mantenimiento Formulas Estampacion";
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

