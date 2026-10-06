package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.anticipacionerrores.mant_defecto", "/app.anticipacionerrores.mant_defecto"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mant_defecto extends GXWebObjectStub
{
   public mant_defecto( )
   {
   }

   public mant_defecto( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mant_defecto.class ));
   }

   public mant_defecto( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mant_defecto_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mant_defecto_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MAnt_Defecto";
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

